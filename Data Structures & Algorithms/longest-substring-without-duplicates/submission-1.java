class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>(); 
        int l =0, res = 0; 

        for(int r = 0; r < s.length(); r++){
            if(map.containsKey(s.charAt(r))){
                // move l to the next position of where s.charAt(r) occurs again
                //Math.max(..., l) = never move l backwards.
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }


            //update a new position of r
            map.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);

        }

        return res;
        
        
    }
}
