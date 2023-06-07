package BinaryTree;

public class LongestSlidingTree {

    static int longestSlide = 0;
    static int leftLength = 0;
    static int rightLength = 0;

    public static int findLongestSlide(TreeNode treeNode) {

//        WIP

        if(treeNode == null){
            System.out.println(treeNode.val);
            System.out.println(leftLength + " " + rightLength);
            return 0;
        }

        if(treeNode.left != null){
            longestSlide = Math.max(longestSlide, rightLength);
            rightLength =0;
            leftLength += 1;
            findLongestSlide(treeNode.left);
        }
        if(treeNode.right != null){
            longestSlide = Math.max(longestSlide, leftLength);
            leftLength=0;
            rightLength += 1;
            findLongestSlide(treeNode.right);
        }

        return longestSlide;
    }


    public static void main(String[] args) {
        // 6    -1 9    7 12    -1 -1 -1 15

        // bfs (level wise or width) ------------- dfs(depth wise)
        /*
                6
          -1         9
                7          12
             1    -1     -1     15
          2
       3
        */
//        Node root = new Node(6);
//        root.right = new Node(9);
//        root.right.left = new Node(7);
//        root.right.left.left = new Node(1);
//        root.right.left.left.left = new Node(2);
//        root.right.left.left.left.left = new Node(3);
//        root.right.right = new Node(12);
//        root.right.right.right = new Node(15);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(8);
        root.left.right.right.left = new TreeNode(9);
        root.left.right.right.right = new TreeNode(10);


        System.out.println(findLongestSlide(root));
    }
}
