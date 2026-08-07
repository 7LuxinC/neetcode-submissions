class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i =0; i< nums.length; i++){
            int add = target - nums[i]; 

            if(map.containsKey(add)){
                return new int[]{map.get(add), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
        
    }
}
