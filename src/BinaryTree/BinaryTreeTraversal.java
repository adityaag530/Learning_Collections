package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeTraversal {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        TreeNode root = createTree();
        sc.close();


//        inOrder(root);
//        System.out.println(heightOfTree(root));
        bfs(root);

    }

    public static TreeNode createTree(){
        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        TreeNode root = new TreeNode(data);

        System.out.println("LEFT of "+ data);
        root.left = createTree();

        System.out.println("RIGHT of "+ data);
        root.right = createTree();

        return root;
    }

    static void inOrder(TreeNode root){
        //IN ORDER -> Left, Value, Right
        // in order traversal will always give you a sorted array; 50%
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    static void preOrder(TreeNode root){

//        PRE ORDER -> Value, Left, Right
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(TreeNode root){

        //POST ORDER -> Left, Right, Value
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    static int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    static int numberOfNodes(TreeNode root){
        if(root ==null){
            return 0;
        }
        return numberOfNodes(root.left) + numberOfNodes(root.right) + 1;
    }

    static int maximumValueInTree(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maximumValueInTree(root.left), maximumValueInTree(root.right)));
        // SC: O(height of tree)/ call stack utna hi deep jaega
        // TC: O(n)/ har node pe ek bare hi jaa rahe
    }

    public static void bfs(TreeNode root){ //LEVEL ORDER TRAVERSAL
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            System.out.print(temp.val+ " ");
            if(temp.right != null){
                s.push(temp.right);
            }
            if(temp.left != null){
                s.push(temp.left);
            }
        }
    }
}
