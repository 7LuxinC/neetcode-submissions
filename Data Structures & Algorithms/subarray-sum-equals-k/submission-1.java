class Solution {
    public int subarraySum(int[] nums, int k) {
        int cur_sum = 0, len =0; 

        Map<Integer, Integer> count =new HashMap<>(); 
        //prefixSum , freq of prefixSum
        count.put(0,1);
        for(int n : nums){
            cur_sum += n; 
            int diff = cur_sum - k ; 
            len += count.getOrDefault(diff, 0); 
            count.put(cur_sum, count.getOrDefault(cur_sum, 0) + 1); 
        }

        return len;
        
    }
}