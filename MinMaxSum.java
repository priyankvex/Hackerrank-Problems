import java.util.Scanner;

/**
 * Created by priyank on 13/12/16.
 *
 * Mini-Max Sum
 *
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] numbers = new long[5];
        for (int i = 0; i < 5; i++){
            numbers[i] = in.nextLong();
        }
        // sort the numbers
        sort(numbers);
        // find the minimum sum
        long minSum = 0 , maxSum = 0;
        for (int i = 0 ; i < 4; i++){
            minSum += numbers[i];
        }
        maxSum = minSum + numbers[4] - numbers[0];
        System.out.println(minSum + " " + maxSum);
    }

    private static void sort(long[] a){

        for (int i = 1; i < a.length; i++){
            long value = a[i];
            int hole = i;
            while (hole > 0 && a[hole-1] > value){
                a[hole] = a[hole-1];
                hole--;
            }
            a[hole] = value;
        }
        //System.out.println(Arrays.toString(a));
    }


}
