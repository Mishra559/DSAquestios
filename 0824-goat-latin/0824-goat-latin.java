class Solution {
    public String toGoatLatin(String sentence) {

        String[] arr = sentence.split(" ");


        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<arr.length;i++){

            String s = arr[i];

            

            char ch = Character.toLowerCase(s.charAt(0));
            

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append(s);
                sb.append("ma");
            }
            else{
                sb.append(s.substring(1));
                sb.append(s.charAt(0));
                sb.append("ma");
            }

            for(int j = 0;j<=i;j++){
                sb.append('a');
            }

            if(i != arr.length-1){
                sb.append(" ");
            }

        }

        return sb.toString();
        
    }
}