class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9]; 
        boolean[][] cols = new boolean[9][9];
        boolean[][] subbox = new boolean[9][9]; 

        for(int i =0; i<9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int n = board[i][j] - '1';//need to change to char number 
                    int subIndex = (i / 3) * 3 + (j / 3); 

                    if(rows[i][n] || cols[j][n] || subbox[subIndex][n]) return false; 

                    rows[i][n] = true; 
                    cols[j][n] = true; 
                    subbox[subIndex][n] = true; 

                }
            }
        }

        return true;
        
    }
}
