class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> list = new ArrayList<>();

        for(int i = 0;i<words.length;i++){
            String str = words[i];
            boolean flag = false;

            for(int j = 0;j<words.length;j++){

                if(i != j && list.indexOf(str) == -1 && words[j].contains(str)){
                    flag = true;
                    break;
                }
            }

            if(flag){
                list.add(str);
            }
        }

        return list;
        
    }
}