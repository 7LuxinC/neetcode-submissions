class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1; 
        int max = 0 ;

        while( l < r){
            int min_height = Math.min(heights[l], heights[r]);
            int width = r - l; 
            int area =min_height * width; 
            max = Math.max(area, max);

            if(heights[l]< heights[r]) l++; 
            else r--; 
            
        }

        return max;
        
    }
}
