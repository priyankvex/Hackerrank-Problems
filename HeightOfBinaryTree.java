/**
 * Created by priyank on 12/12/16.
 *
 * Tree: Height of a Binary Tree
 *
 * The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of .

 * Complete the getHeight function provided in your editor so that it returns the height of a binary tree. This function has a parameter, , which is a pointer to the root node of a binary tree.

 * Input Format

 * You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your getHeight function.

 * Output Format

 * Your function should return a single integer denoting the height of the binary tree.
 *
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree
 */


public class HeightOfBinaryTree {

    private static class Node{
        Node right;
        Node left;
        int data;
        Node(int n){
            data = n;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);
        root.right.right.right.left = new Node(7);

        int height = getHeight(root);

        System.out.println(height);
    }

    private static int getHeight(Node root) {

        if (root == null){
            return -1;
        }
        int height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        return height;
    }
}
