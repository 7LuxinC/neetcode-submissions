class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length; 
        int[] res = new int[n]; 

        res[0] = 1; 
        for(int i = 1; i< n; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        int posfix = 1; 
        for(int i = n - 1; i >= 0; i--){
            res[i] *= posfix; 
            posfix *= nums[i]; 
        }
        return res;  
    }
}  
