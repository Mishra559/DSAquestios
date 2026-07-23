class Solution {
    public int minLength(String s) {

        // while(s.contains("AB") || s.contains("CD")){

        //     if(s.contains("AB")){
        //         s = s.replace("AB","");
        //     }

        //     if(s.contains("CD")){
        //         s = s.replace("CD","");
        //     }
        // }

        // return s.length();


        // Stack<Character> stack = new Stack<>();

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch:s.toCharArray()){

            if(!stack.isEmpty() && ch == 'B' && stack.peek() == 'A'){
                stack.pop();
            }
            else if(!stack.isEmpty() && ch == 'D' && stack.peek() == 'C'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        return stack.size();
        
    }
}