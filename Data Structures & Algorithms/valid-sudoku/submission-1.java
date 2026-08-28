class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9]; 
        boolean[][] cols = new boolean[9][9];
        boolean[][] subBoxes = new boolean[9][9]; 

        for(int i =0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    //char to num
                    int n = board[i][j] - '1'; 
                    //locate which subboxes in the sudoku
                    int boxIndex = (i / 3) * 3 + (j /3);

                    if(rows[i][n] || cols[j][n] || subBoxes[boxIndex][n]) return false; 

                    rows[i][n] = true; 
                    cols[j][n] = true; 
                    subBoxes[boxIndex][n] = true; 

                }
            }
        } 
        return true;  
        
    }
}
