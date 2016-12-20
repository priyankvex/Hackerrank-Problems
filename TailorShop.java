import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by priyank on 20/12/16.
 */
public class TailorShop {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        solve(n, p, a);
    }

    private static void solve(int n, int p, int[] a){

        int sum = 0;

        // sort the input data
        sort(a, 0, n-1);
        for (int i = 0; i < n; i++){
            int minCount;
            if (a[i] % p == 0){
                minCount = a[i]/p;
            }
            else{
                minCount = (a[i])/p;
                minCount++;
            }
            if (i == 0){
                a[i] = minCount;
                sum += minCount;
            }
            else{
                if (minCount <= a[i-1]){
                    minCount = a[i-1] + 1;
                    a[i] = minCount;
                    sum += minCount;
                }
                else{
                    a[i] = minCount;
                    sum += minCount;
                }
            }
        }

        System.out.println(sum);
    }

    private static void sort(int[] a, int l, int h){
        if (l < h){
            int mid = (l + h)/2;
            sort(a, l, mid);
            sort(a, mid+1, h);
            merge(a, l, mid, h);
        }
    }

    private static void merge(int[] a, int l, int mid, int h){

        int n1 = mid - l + 1;
        int n2 = h - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0 ; i < n1; i++){
            leftArray[i] = a[l+i];
        }
        for (int i = 0; i < n2; i++){
            rightArray[i] = a[mid+1+i];
        }
        int index = 0, i = 0, j = 0;
        while (i < n1 && j < n2){
            if (leftArray[i] < rightArray[j]){
                a[l+index] = leftArray[i];
                i++;
                index++;
            }
            else{
                a[l+index] = rightArray[j];
                j++;
                index++;
            }
        }
        while (i < n1){
            a[l+index] = leftArray[i];
            i++;
            index++;
        }
        while (j < n2){
            a[l+index] = rightArray[j];
            j++;
            index++;
        }
    }

}
