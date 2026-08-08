class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> tmp = new ArrayList<>(); 

        for(int n : nums){
            if(n != val) tmp.add(n);
        }

        for(int i =0; i< tmp.size(); i++){
            nums[i] = tmp.get(i);
        }

        return tmp.size(); 
        
    }
}