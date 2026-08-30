class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>(); 

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        List<Integer> res = new ArrayList<>(); 
        for(int key : map.keySet()){
            if(map.get(key) > nums.length / 3){
                res.add(key);
            }
        }
        return res;  
    }
}