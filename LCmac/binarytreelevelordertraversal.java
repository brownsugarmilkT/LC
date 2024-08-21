import java.util.*;

public class binarytreelevelordertraversal {
    
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


    public List<List<Integer>> levelOrder(TreeNode root) {

        
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();

            List<Integer> curLevel = new ArrayList<>();

            for(int i =0;i<size;i++){

                
                TreeNode node = q.poll();
                curLevel.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
        }
            result.add(curLevel);

    }

        return result;
        
        
    }
}