import java.util.Scanner;

/**
 * Created by priyank on 18/12/16.
 *
 * https://www.hackerrank.com/contests/world-codesprint-8/challenges/climbing-the-leaderboard
 */
public class ClimbingTheLeaderboard {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int index = 0;
        for(int i = 0; i < n; i++){
            if (index == 0){
                a[index] = in.nextInt();
                index++;
            }
            else{
                int temp = in.nextInt();
                if (temp != a[index-1]){
                    a[index] = temp;
                    index++;
                }
            }
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }
        solve(a, index, b);
    }

    private static void solve(int[] a, int index, int[] b){
        int k = 0, i = index-1;
        while (k != b.length){
            if (b[k] < a[i]){
                System.out.println(i+2);
                k++;
            }
            else if (b[k] == a[i]){
                System.out.println(i+1);
                k++;
            }
            else if (b[k] > a[i]){
                if (i == 0){
                    System.out.println(i+1);
                    k++;
                }
                else{
                    i--;
                }
            }
        }
    }
}
