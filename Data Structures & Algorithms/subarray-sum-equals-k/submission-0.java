class Solution {
    public int subarraySum(int[] nums, int k) {

        int len = 0, curr_sum = 0; 
        Map<Integer, Integer> count = new HashMap<>(); 
        count.put(0, 1);

        for(int n : nums){
            curr_sum += n; 
            int diff = curr_sum - k; 
            len += count.getOrDefault(diff, 0);
            count.put(curr_sum, count.getOrDefault(curr_sum,0) + 1);


        }

        return len; 
        
    }
}