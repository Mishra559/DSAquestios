class Solution {
    public String makeGood(String s) {

        if(s.length() == 1){
            return s;
        }

        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(ch - stack.peek()) == 32){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        if(stack.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for(char ch:stack){
            sb.append(ch);
        }


        return sb.toString();
        
    }
}