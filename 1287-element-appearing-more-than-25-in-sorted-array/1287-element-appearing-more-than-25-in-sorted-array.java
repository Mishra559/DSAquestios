class Solution {
    public int findSpecialInteger(int[] arr) {

        if(arr.length == 1){
            return arr[0];
        }

        int x = (arr.length * 25)/100;

       for(int i = 0;i<arr.length-1;i++){

        int count = 1;

        if(arr[i] == arr[i+1]){
            while(i+1<arr.length && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count > x){
                return arr[i];
            }
        }
       }
       return 0;
        
    }
}