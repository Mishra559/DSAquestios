class Solution {
    public int[] scoreValidator(String[] events) {

        int[] arr = new int[2];
    

        for(String str:events){

           if(str.equals("1")){
                arr[0] = arr[0] + 1;
            } 

            if(str.equals("2")){
                arr[0] = arr[0] + 2;
            }

            if(str.equals("3")){
                arr[0] = arr[0] + 3;
            }

            if(str.equals("4")){
               arr[0] = arr[0] + 4;
            }

            if(str.equals("6")){
               arr[0] = arr[0] + 6;
            }
            
            if(str.equals("WD")){
                arr[0] = arr[0] + 1;
            }

            if(str.equals("W")){
                arr[1]++;

                if(arr[1] == 10){
                    return arr;
                }
            }

            if(str.equals("NB")){
                arr[0] = arr[0] + 1;
            }

        }

        return arr;
        
    }
}