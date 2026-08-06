class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int idx = 0; 

        for(int i = 0; i < 2; i++){
            for(int n : nums){
                arr[idx++] = n;
            }
        }

        return arr;
        
    }
}