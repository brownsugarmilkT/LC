
import java.util.LinkedList;
import java.util.Queue;


public class numberofislands {
    
}


class Solution {
    
    public int numIslands(char[][] grid) {

        if(grid == null){
            return 0;

        }

        int rows = grid.length;
        int cols = grid[0].length;
        
        int islands = 0;

        boolean[][] visited = new boolean[rows][cols];



        for (int r = 0;r<rows;r++){
            for(int c = 0 ;c<cols;c++){
                if(grid[r][c] == '1' && visited[r][c]!=true){
                    bfs(r,c, grid, visited);
                    islands++;

                }
            }
        }
        return islands;



        
    }

    private void bfs(int row, int col, char[][] grid,boolean[][] visited ){

        
        Queue<int[]> q = new LinkedList<>();

        visited[row][col] = true;
        q.add(new int[] { row, col });
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!q.isEmpty()){
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];
            

            for(int[]dir:directions){
                int newRow = r + dir[0];
                int newCol = c + dir[1];


               if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length &&
                    grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    q.add(new int[] { newRow, newCol });
                    visited[newRow][newCol] = true;
                
            }
        }


        }



        

            

        };
    }



