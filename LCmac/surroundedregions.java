//import java.util.*;; 
public class surroundedregions {
    
}

class Solution {
    public void solve(char[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] op = new boolean[rows][cols]; // overpowered cell, cant be overtaken 

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(board[r][c] == 'O' ){
                    if(r ==0 || c ==0 || r == rows-1 || c == cols - 1){
                        dfs(board, r, c, op);

                    }
                }
                
            }
        }

        

        for(int r = 0;r<rows;r++){
            for(int c=0;c<cols;c++){
                
                if (!op[r][c] && board[r][c] == 'O') {
                    board[r][c] = 'X';
                }
                
            }
        }


    }


    private void dfs(char[][] board, int r, int c, boolean[][] op){

        int rows = board.length;
        int cols = board[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || board[r][c] != 'O' || op[r][c]) {
            return;
        }
        op[r][c] = true;
        
        dfs(board, r + 1, c, op);
        dfs(board, r - 1, c, op);
        dfs(board, r, c + 1, op);
        dfs(board, r, c - 1, op);
    }
}


// idea was to traverse the matrix once, when an OP cell is found, dfs from it .
// now traverse the matrix again, if the cell isnt OP ( connected to the original OP cell), convert to X
