class NumMatrix {
    private int[][] dp; 

    public NumMatrix(int[][] matrix) {
        int row = matrix.length; 
        int col = matrix[0].length;
        dp = new int[row + 1][col + 1];

        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
                int above = dp[i][j + 1]; 
                int left= dp[i + 1][j]; 
                int m = matrix[i][j]; 
                dp[i + 1][j + 1] = above + left + m - dp[i][j]; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = dp[row2 + 1][col2 + 1]; 
        int above = dp[row1][col2 + 1];
        int left = dp[row2 + 1][col1];
        int m = dp[row1][col1];
        return total - above - left + m;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */