class Solution {
    public String getEncryptedString(String s, int k) {


        char[] ch = s.toCharArray();

        k = k%ch.length;

        rotateArray(ch,0,k-1);
        rotateArray(ch,k,ch.length-1);
        rotateArray(ch,0,ch.length-1);


        return new String(ch);        
    }

    public static void rotateArray(char[] ch,int x,int y){
        int i = x;
        int j = y;

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}