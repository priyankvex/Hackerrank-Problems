/**
 * Created by priyank on 12/12/16.
 *
 * Tree : Top View
 *
 * You are given a pointer to the root of a binary tree.
 * Print the top view of the binary tree.
 * You only have to complete the function.
 *
 * https://www.hackerrank.com/challenges/tree-top-view
 */
public class TreeTopView {

    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int n){
            data = n;
            left =  null;
            right = null;
        }
    }

    public static void main(String[] args){

        // create the tree
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.left.left.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);

        //print the top view of the tree
        top_view(root);
    }

    private static void top_view(Node root){

        if (root == null){
            return;
        }
        leftTopView(root.left);
        System.out.print(root.data + " ");
        rightTopView(root.right);
    }

    private static void leftTopView(Node root){

        if (root == null){
            return;
        }
        leftTopView(root.left);
        System.out.print(root.data + " ");
    }

    private static void rightTopView(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        rightTopView(root.right);
    }
}
