/**
 * Created by priyank on 15/12/16.
 *
 * https://www.hackerrank.com/challenges/binary-search-tree-insertion
 * 
 */
public class BinarySearchTreeInsertion {

    private static class Node{
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args){

        Node root = insert(null, 6);
        insert(root, 5);
        insert(root, 4);
        insert(root, 3);
        insert(root, 7);
        insert(root, 8);
        printTree(root);
    }

    private static Node insert(Node root, int value){

        if (root == null){
            Node n = new Node();
            n.data = value;
            n.left = null;
            n.right = null;
            root  = n;
            return root;
        }

        if (value < root.data){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }

        return root;
    }

    private static void printTree(Node root){

        if (root == null){
            return;
        }
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }
}
