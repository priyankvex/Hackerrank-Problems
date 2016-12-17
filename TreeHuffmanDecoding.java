import java.util.Scanner;

/**
 * Created by priyank on 17/12/16.
 *
 * https://www.hackerrank.com/challenges/tree-huffman-decoding
 */
public class TreeHuffmanDecoding {

    private static class Node{
        int freq;
        char data;
        Node left;
        Node right;
        Node(int freq, char c){
            this.freq = freq;
            data = c;
        }
    }

    public static void main(String[] args){

        // create the test tree
        Node root = new Node(5, '\0');
        root.left = new Node(2, '\0');
        root.right = new Node(3, 'A');
        root.left.left = new Node(1, 'B');
        root.left.right = new Node(1, 'C');

        Scanner in = new Scanner(System.in);
        String s = in.next();
        decode(s, root);
    }

    private static void decode(String s, Node root){

        if (root == null){
            return;
        }
        Node temp = root;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (temp.data == '\0'){
                if (c == '0'){
                    temp = temp.left;
                }
                else{
                    temp = temp.right;
                }
            }
            if (temp.data != '\0'){
                // leaf node reached
                System.out.print(temp.data);
                temp = root;
            }
        }
    }
}
