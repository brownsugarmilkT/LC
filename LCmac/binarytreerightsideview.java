import java.util.*;

public class binarytreerightsideview {
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
}

class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        

        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res; 
        }


        bfs(root, res);

        return res;


        
    }

    private void bfs(TreeNode root,  List<Integer> res ){

        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int currentLevel = 0;
        TreeNode rightmostNode = null;

        while(!q.isEmpty()){

            Pair cur = q.poll();
            TreeNode curNode = cur.node;
            int nodeLevel = cur.level;

            if(nodeLevel>currentLevel){
                res.add(rightmostNode.val);
                currentLevel = nodeLevel;
            }

            rightmostNode = curNode;

            if(curNode.left!=null ){
                q.add(new Pair(curNode.left, nodeLevel + 1));
            }


            if(curNode.right!=null){
                q.add(new Pair(curNode.right, nodeLevel + 1));
            }
            
            
            
        }
        if (rightmostNode != null) {
            res.add(rightmostNode.val);
        }
    }
}