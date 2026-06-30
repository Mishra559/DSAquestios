class Solution {
    public boolean isAcronym(List<String> words, String s) {

        int n = words.size();
        int x = s.length();

        if(n != x){
            return false;
        }

        for(int i = 0;i<n;i++){
            if(!words.get(i).startsWith(String.valueOf(s.charAt(i)))){
                return false;
            }
        }
        return true;
        
    }
}