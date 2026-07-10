class Solution {
    public String kthDistinct(String[] arr, int k) {

        Map<String,Integer> map = new LinkedHashMap<>();

        String result = "";


        for(String str:arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for(String str:map.keySet()){
            if(map.get(str) == 1){

                if(k == 1){
                    result = str;
                    break;
                }
                else{
                    k--;
                }

            }
        }

        return result;
        
    }
}