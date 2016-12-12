/**
 * Created by priyank on 12/12/16.
 *
 * Tree: Level Order Traversal.
 *
 * You are given a pointer to the root of a binary tree.
 * You need to print the level order traversal of this tree.
 * In level order traversal, we visit the nodes level by level from left to right. You only have to complete the function.
 *
 * https://www.hackerrank.com/challenges/tree-level-order-traversal
 */
public class TreeLevelOrderTraversal {

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

        //print levels of tree
        printLevel(root);
    }

    private static void printLevel(Node root){

        int height = getTreeHeight(root);
        for (int i = 0; i < height; i++){
            printNodesAtLevel(root, i);
        }
    }

    private static int getTreeHeight(Node root){
        if (root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }

    private static void printNodesAtLevel(Node root, int height){

        if (root == null){
            return;
        }
        if (height > 0){
            printNodesAtLevel(root.left, height-1);
            printNodesAtLevel(root.right, height-1);
        }
        if (height == 0){
            System.out.print(root.data + " ");
        }
    }

}
