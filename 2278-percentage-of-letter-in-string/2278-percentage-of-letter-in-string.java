class Solution {
    public int percentageLetter(String s, char letter) {

        
        // int[] arr = new int[26];

        // for(int i = 0;i<s.length();i++){
        //     char ch = s.charAt(i);

        //     int x = ch - 'a';
        //     arr[x]++;

        // }

        // int x = letter - 'a';

        // return (arr[x]*100)/s.length();

        int count = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }

        return (count*100)/s.length();
        
    }
}