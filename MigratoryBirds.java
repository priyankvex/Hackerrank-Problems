import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by priyank on 11/2/17.
 */
public class MigratoryBirds {

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        solve(a, n);
    }

    private static void solve(int[] a, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        // initialize the map values
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        map.put(5, 0);
        // put the values in map
        for (int i = 0; i < n; i++){
            int temp = map.get(a[i]);
            map.put(a[i], ++temp);
        }
        // find the max value
        int max = -1, maxKey = -1;
        for (int key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                maxKey = key;
            }
            else if (map.get(key) == max && key < maxKey){
                // same max value found at a lower key
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
