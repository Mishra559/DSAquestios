class Solution {
    public String reverseByType(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;


        while(i<j){

            if(!Character.isLetterOrDigit(arr[i])){
                if(!Character.isLetterOrDigit(arr[j])){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }

        i = 0;
        j = arr.length - 1;


         while(i<j){

            if(Character.isLetterOrDigit(arr[i])){
                if(Character.isLetterOrDigit(arr[j])){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }

        return new String(arr);
        
    }
}