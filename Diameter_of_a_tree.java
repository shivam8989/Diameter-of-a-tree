package Binary_Tree;

public class Diameter_of_a_tree  {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdiam = Diameter(root.left);
        int lefth = height(root.left);
        int rightdiam = Diameter(root.right);
        int righth = height(root.right);
        int selfdiam = lefth+righth+1;

        return Math.max(selfdiam, Math.max(leftdiam,rightdiam));
    }
    public static void main(String args []){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(9);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        System.out.println(Diameter(root));
    }
}
