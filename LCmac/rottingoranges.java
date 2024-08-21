import java.util.*;
public class rottingoranges {
    
}

class Solution {
    public int orangesRotting(int[][] grid) {


        Queue<int[]> q = new LinkedList<>();
        
        int rows = grid.length;
        int cols = grid[0].length;

        int time = 0;
        int fresh = 0;

        for (int r = 0;r<rows;r++){
            for(int c = 0 ;c<cols;c++){
                if(grid[r][c] == 1 ){
                    fresh++;
                }else if(grid[r][c] == 2 ){
                    q.add(new int[] {r,c});
                }
            }
        }

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] pos = q.poll();

                int r = pos[0];
                int c = pos[1];


                for(int[]dir:directions){
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];
    
    
                    if (newRow < 0 || newRow == grid.length || newCol < 0 || newCol ==grid[0].length || grid[newRow][newCol] != 1 ) {
                            continue;
                     }   
                    grid[newRow][newCol] = 2;
                    q.add(new int[] {newRow,newCol});
                    fresh--;

            }

            }
            time++;

            
        }

        if(fresh ==0){
            return time;
        }else{
            return -1;

        }



        
    }
}

