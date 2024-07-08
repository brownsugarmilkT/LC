import javax.swing.tree.TreeNode;

public class maximumdepthofabinarytree {


  public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
 
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int hL = 0;
        int hR = 0;
        if(root.right!=null){
            hR = 1 + maxDepth(root.right);
        }else{
            hR++;
        }
        if(root.left!=null){
            hL = 1 + maxDepth(root.left);
        }else{
            hL++;
        }
        return Math.max(hL,hR);

    }

    

    private int recurse(TreeNode root){
        if(root == null){
            return height;

        }


        if(root.right!=null){
            int index = height + 1;

            recurse(root.right);

        }
    }
}
}
