class Solution {
    public int[] applyOperations(int[] arr) {

        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                int x = arr[i];
                arr[i] = 2*x;
                arr[i+1] = 0;
            }
        }

        int i = 0;
        int j = 0;

        while(j<arr.length){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        return arr;


        
    }
}