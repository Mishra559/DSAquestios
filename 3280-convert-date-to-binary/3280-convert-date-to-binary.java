class Solution {
    public String convertDateToBinary(String date) {

        String[] arr = date.split("-");

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<arr.length;i++){
            int y = Integer.parseInt(arr[i]);

            sb.append(Integer.toBinaryString(y));
            if(i != arr.length-1){
                sb.append('-');
            }
        }

        return sb.toString();
        
    }
}