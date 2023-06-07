package BinaryTree;


public class BinaryTreeViolationsByChatGPT {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(12);
        root.right.right.right = new TreeNode(15);
        System.out.println(countViolations(root));
    }

    static int countViolations(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int violations = 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            violations++;
        }

        violations += countViolations(root.left);
        violations += countViolations(root.right);

        return violations;
    }


    static int getHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int leftHeight = getHeight(treeNode.left);
        int rightHeight = getHeight(treeNode.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
