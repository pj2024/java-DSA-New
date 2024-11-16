
import java.util.Arrays;



public class Practice {
    
    /*
      Question 1 : Count how many times lowercase vowels occurred in a String entered by the user.
    */

    public static int count_lowercase_vowels(String str){
        int count = 0;

        for(int i=0;i<str.length();i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }
   
    /*

    Question 4 : Determine if 2 Strings are anagrams of each other.
    What are anagrams?
    If two strings contain the same characters but in a different order, they can be said to be
    anagrams. Consider race and care. In this case, race's characters can be formed into a study,
    or care's characters can be formed into race. Below is a java program to check if two strings
    are anagrams or not.
   
   */


   public static boolean isAnagrm(String str1, String str2){
    int arr[] = new int[str1.length()];

    for(int i=0;i<str1.length();i++){
        for(int j=0;j<str2.length();i++){
            if (str1.charAt(i) == str2.charAt(j)) {
                arr[i] += 1; 
            }
        }
    }

    for(int i=0;i<arr.length;i++){
        if (arr[i] != 1) {
            return false;
        }
    }
    return true;
   }  
  

   public static void isAnagrm2(String str1,String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and "+ str2 +" are anagrams of each others.");
            }
            else{
                System.out.println(str1 + " and "+ str2 +" are not anagrams of each others.");
            }
            
        }
        else{
            System.out.println(str1 + " and "+ str2 +" are not anagrams of each others.");
        }
   }
   
   public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        System.out.println( count_lowercase_vowels(str)); 
        */
    

        /* 
         
        String str = "ShradhaDidi";
        String str1 = "ApnaCollage";
        String str2 = "ShradhaDidi";
        
        System.ou
        println(str.equals(str1) +" "+ str.equals(str2));
        
        */

        
        /*
         
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
        
        // ApnaCoege
        
        */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first string: ");
        // String str1 = sc.next();
        // System.out.println("Enter second string: ");
        // String str2 = sc.next();

        String str1 = "Earth"; 
        String str2 = "Heart";
        isAnagrm2(str1, str2);
    }
}
