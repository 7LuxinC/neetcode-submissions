class Solution {
    public void reverseString(char[] s) {

        char[] t = new char[s.length];
        int k = 0;  
        for(int i = s.length -1 ; i>=0; i--){
            t[k++] = s[i];
        }

        for(int i = 0; i< s.length; i++){
            s[i] = t[i];
        }
        
    }
}