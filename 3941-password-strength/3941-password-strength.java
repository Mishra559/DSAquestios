class Solution {
    public int passwordStrength(String password) {

        Set<Character> set = new HashSet<>();



        int sum = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            set.add(ch);
        }


        for(char ch:set){
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    sum+=2;
                }
                else{
                    sum+=1;
                }
            }
            else if(Character.isDigit(ch)){
                sum += 3;
            }
            else if(ch == '!' || ch == '@' || ch == '#' || ch == '$'){
                sum += 5;
            }
        }

        return sum;

    }
}