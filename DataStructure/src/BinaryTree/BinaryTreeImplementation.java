package BinaryTree;

/*
    A binary tree must a root which has at most 2 node (left & right)

    Number of Node : 2^n -1   (n = level of the tree)

 */

public class BinaryTreeImplementation {

    public static void main(String[] args) {

        // create a binary tree
        BinaryTree binaryTree = new BinaryTree();

        //create needed node
        Node root = new Node(1, "Jake");
        Node node2 = new Node(2, "Tom");
        Node node3 = new Node(3, "Joe");
        Node node4 = new Node(4, "Mia");
        Node node5 = new Node(5, "Zoe");

        //manual create binary tree
        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node5);
        binaryTree.setRoot(root);

        System.out.println("Preorder: ");
        binaryTree.preOrder();

        System.out.println("InfixOrder: ");
        binaryTree.infixOrder();

        System.out.println("PostOrder: ");
        binaryTree.postOrder();
    }
}

class BinaryTree{
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }else {
            System.out.println("The tree is empty.");
        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("The tree is empty.");
        }
    }

    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("The tree is empty.");
        }
    }
}

class Node{
     private Node left;  //default null
     private Node right; //default null
     private int no;
     private String name;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public void preOrder(){
        System.out.println(this);
        //left side tree
        if (this.left != null){
            this.left.preOrder();
        }
        //right side tree
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public void infixOrder(){
        //left side tree
        if (this.left != null){
            this.left.infixOrder();
        }
        //output parent node
        System.out.println(this);

        //right side tree
        if (this.right != null){
            this.right.infixOrder();
        }
    }

    public void postOrder(){
        //left side tree
        if (this.left != null){
            this.left.postOrder();
        }

        //right side tree
        if (this.right != null){
            this.right.postOrder();
        }

        //output parent node
        System.out.println(this);
    }
}


