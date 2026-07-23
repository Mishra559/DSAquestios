class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        Set<Integer> set = new HashSet<>();
        int n= grid.length;

        int repeated = 0;

        for(int i = 0;i<grid.length;i++){

            for(int j = 0;j<grid[i].length;j++){
                int x = grid[i][j];
                if(set.contains(x)){
                    repeated = x;
                }
                set.add(x);
            }
        }

        int missing = 0;

        for(int i = 1;i<=n*n;i++){

            if(!set.contains(i)){
                missing = i;
                break;
            }
        }

        

        
        return new int[]{repeated,missing};
}
}
