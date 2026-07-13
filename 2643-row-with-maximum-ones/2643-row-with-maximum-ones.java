class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int[] arr = new int[2];
        int maxOnes = 0;

        for(int i = 0;i<mat.length;i++){

            int max = 0;

            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    max++;
                }
            }

            if(max > maxOnes){
                maxOnes = max;
                arr[0] = i;
                arr[1] = max;
            }

        }

        return arr;
        
    }
}