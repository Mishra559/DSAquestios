class Solution {
    public int minimizedStringLength(String s) {

        // Set<Character> set = new LinkedHashSet<>();

        // for(char ch:s.toCharArray()){
        //     set.add(ch);
        // }

        // return set.size();

        int[] arr = new int[26];

        for(char ch:s.toCharArray()){
            arr[ch - 'a']++;
        }

        int count = 0;

        for(int x : arr){
            if(x != 0){
                count++;
            }
        }

        return count;
        
    }
}