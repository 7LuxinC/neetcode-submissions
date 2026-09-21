class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]); 

        Stack<Integer> stack = new Stack<>(); 

        int sum = 0; 

        for(String s : tokens){
            if(s.equals("+")){
                int n1 = stack.pop(); 
                int n2 = stack.pop(); 
                sum = n1 + n2; 
                stack.push(sum);

            }else if(s.equals("*")){
                int n1 = stack.pop(); 
                int n2 = stack.pop(); 
                sum = n1 * n2; 
                stack.push(sum); 

            }else if(s.equals("-")){
                int n2 = stack.pop(); 
                int n1 = stack.pop(); 
                sum = n1 - n2; 
                stack.push(sum); 

            }else if(s.equals("/")){

                int n2 = stack.pop(); 
                int n1 = stack.pop(); 
                sum = n1 / n2; 
                stack.push(sum); 

            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        return sum;



        
    }
}
