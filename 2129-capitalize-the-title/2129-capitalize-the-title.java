class Solution {
    public String capitalizeTitle(String title) {

        String[] arr = title.split(" ");

        for(int i = 0;i<arr.length;i++){
            String str = arr[i];
            str = str.toLowerCase();

            if(str.length()<=2){      
                arr[i] = str;
            }
            else{
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                arr[i] = sb.toString();
            }
        }

        return String.join(" ",arr);
        
    }
}