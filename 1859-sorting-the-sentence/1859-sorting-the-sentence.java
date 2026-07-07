class Solution {
    public String sortSentence(String s) {

        String[] arr = s.split(" ");
        String[] strArr = new String[arr.length];

        for(int i = 0;i<arr.length;i++){
            String str = arr[i];
            char ch = str.charAt(str.length()-1);
            int d = ch - '0';
            strArr[d-1] = str.substring(0,str.length()-1);
        }

        String result = String.join(" ", strArr);

        return result;

        
        
    }
}