class NumMatrix {
    private int[][] dp; 

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length; 
        int cols = matrix[0].length; 
        dp = new int[rows + 1][cols + 1];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int above = dp[i][j + 1]; 
                int left = dp[i + 1][j];
                int common = dp[i][j];
                dp[i + 1][j + 1] = above + left + matrix[i][j] - common; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = dp[row2 + 1][col2 + 1]; 
        int above = dp[row1][col2 + 1];
        int left = dp[row2 + 1][col1];
        int common = dp[row1][col1];

        return total - above - left + common;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */