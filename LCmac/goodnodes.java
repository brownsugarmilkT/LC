public class goodnodes {
    
}


 class TreeNode {
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
    public int goodNodes(TreeNode root) {
        int curMax  = -10000;
        



        return TtoD(root, curMax);
        
        
    }

    private int TtoD(TreeNode root, int curMax){
        if(root ==null) return 0;


        int ans = 0;

    
        if(root.val>=curMax){
            ans = 1;
        }

        curMax = Math.max(root.val, curMax);

        ans = ans + TtoD(root.left, curMax);
        ans = ans + TtoD(root.right, curMax);


        return ans;

        


        


    }
}