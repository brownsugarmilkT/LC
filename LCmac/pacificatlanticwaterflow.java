import java.util.*;;

public class pacificatlanticwaterflow {
    
}


class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        if(heights == null){
            return null;

        }

        int rows = heights.length;
        int cols = heights[0].length;

        
        Set<List<Integer>> p= new HashSet<>();
        Set<List<Integer>> a = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int r = 0; r<rows;r++){
            dfs(heights, r, 0, p, heights[r][0]);
            dfs(heights, r, cols - 1, a, heights[r][cols - 1]);
        }


        for(int c = 0; c<cols;c++){
            dfs(heights, 0, c, p, heights[0][c]);
            dfs(heights, rows-1, c, a, heights[rows-1][c]);
        }


        
        for(int r = 0;r<rows;r++){
            for(int c = 0;c<cols;c++){
                List<Integer> pos = Arrays.asList(r, c);
                if(p.contains(pos) && a.contains(pos)){
                    res.add(pos);



                }
            }
        }

        return res;



        
    }

    private void dfs(int[][] h, int r, int c, Set<List<Integer>> visit, int prevHeight){

        int rows = h.length;
        int cols = h[0].length;

        if (visit.contains(Arrays.asList(r, c)) || r < 0 || c < 0 || r >= rows || c >= cols || h[r][c] < prevHeight) {
            return;
        }
        visit.add(Arrays.asList(r, c));
        dfs(h, r + 1, c, visit, h[r][c]);
        dfs(h, r - 1, c, visit, h[r][c]);
        dfs(h, r, c + 1, visit, h[r][c]);
        dfs(h, r, c - 1, visit, h[r][c]);
    }
}