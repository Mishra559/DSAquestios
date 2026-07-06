class Solution {
    public String removeStars(String s) {

        // Stack<Character> stack = new Stack<>();

        // for(int i = 0;i<s.length();i++){
        //     char ch = s.charAt(i);

        //     if(ch == '*'){
        //         stack.pop();
        //     }
        //     else{
        //         stack.push(ch);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();

        // while(!stack.isEmpty()){
        //     sb.append(stack.pop());
        // }

        // return sb.reverse().toString();


        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }


        return sb.toString();

        
        
    }
}