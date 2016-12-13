import java.util.Scanner;

/**
 * Created by priyank on 13/12/16.
 *
 * Designer PDF Viewer
 *
 * https://www.hackerrank.com/challenges/designer-pdf-viewer?h_r=next-challenge&h_v=zen
 *
 */
public class DesignerPdfViewer {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] heights = new int[26];
        for (int i = 0; i < 26; i++){
            heights[i] = in.nextInt();
        }
        String word = in.next();
        solve(heights, word);
    }

    private static void solve(int[] h, String s){

        int maxHeight = h[s.charAt(0) - 97];

        for (int i = 0; i < s.length(); i++){
            if (h[s.charAt(i) - 97] > maxHeight){
                maxHeight = h[s.charAt(i) - 97];
            }
        }

        System.out.println(maxHeight * s.length());

    }
}
