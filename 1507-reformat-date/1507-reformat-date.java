class Solution {
    public String reformatDate(String date) {

        String[] arr = date.split(" ");

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        StringBuilder sb = new StringBuilder();

        sb.append(arr[2]);
        sb.append('-');
        int x = 0;


        for(int i = 0;i<month.length;i++){
            if(month[i].equals(arr[1])){
                x = i+1;
                break;
            }
        }

        if(x<=9){
            sb.append('0');   
        }
        sb.append(Integer.toString(x));
        sb.append('-');

        x = 0;

        for(int i = 0;i<arr[0].length();i++){
            char ch = arr[0].charAt(i);
            if(Character.isDigit(ch)){
                x++;
            }
        }
        if(x == 1){
            sb.append('0');
        }

        String sub = arr[0].substring(0,x);


        sb.append(sub);

        return sb.toString();
        
    }
}