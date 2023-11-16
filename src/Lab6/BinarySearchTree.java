package Lab6;

public class BinarySearchTree<E extends Comparable<E>> {
    private class Node {
        public E  data;
        public Node left;
        public Node right;
    }
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
            root = newNode;
        else insertSub(newNode, root);
    }

    public void insertIterative(E element){
        Node newNode = new Node();
        newNode.data = element;
        if (root == null){
            root = newNode;
        }
        Node current = root;
        while (true){

            int result = newNode.data.compareTo(current.data);

            if (result >= 0 ){
                if (current.right == null){
                    current.right = newNode;
                    return;
                }else {
                    current = current.right;
                }
            }else {

                if (current.left == null){
                    current.left = newNode;
                    return;
                }else {
                    current = current.left;
                }
            }


        }
    }

    private void insertSub(Node newNode, Node node) {
        int result = newNode.data.compareTo(node.data);
        // duplicates go to the right
        if (result >= 0) {
            //go right
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertSub(newNode, node.right);
            }
        } else {
            // go left
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertSub(newNode, node.left);
            }
        }
    }

    public void print(){
        if (root != null)
            printSub(root);
    }

    private void printSub(Node node) {
        //inorder traversal
        if (node != null){
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }

    public boolean isEmpty(){
        if (root == null){
            return true;
        }else {
            return false;
        }
    }

    public boolean contains(E element){
        Node newNode = new Node();
        newNode.data = element;

        Node current = root;

        while (current != null){

            int result = newNode.data.compareTo(current.data);

            if (result >= 0 ){
                if (current.right == newNode){
                    return true;
                }else {
                    current = current.right;
                }
            }else {
                if (current.left == newNode){
                    return true;
                }else {
                    current = current.left;
                }
            }

        }

        return false;
    }


}
