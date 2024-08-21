public class diameterofbinarytree {
    
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {

    private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        
        

        height(root);
        return diameter;

        
    }

    private int height(TreeNode root){
        if(root == null){
            return 0;

        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);


    }
}