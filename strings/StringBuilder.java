public class StringBuilder {
    
    public static String compress(String str){
        StringBuilder new_str = new StringBuilder();

        
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) { 
                count++;
                i++;
            }

            new_str.append(str.charAt(i));
            if (count > 1) {
                new_str.append(count.toString());
            }
        }
        return new_str;
    }
    
    public static void main(String args[]) {
        String str = "aaabbccc";
        // System.out.println(compress(str));
    }
}
