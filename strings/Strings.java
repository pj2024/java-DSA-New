


public class Strings{

    public static void print_letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }


    // "noon", "madam", "racecar"
    // O(n)
    public static boolean  check_string_is_palindrome(String str){
        int n = str.length();
        for(int i=0;i<=n/2;i++){
            if (str.charAt(i) != str.charAt(n-i-1)) {
               return false; 
            }
        }

        return true;
    }
  
    
    // O(n)
    public static boolean isPalindrome_valid(String s) {
        String new_str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = new_str.length();
        for(int i=0;i<n/2;i++){
            if(new_str.charAt(i) != new_str.charAt(n-i-1)){
                return false;
            }
        }

        return true;
    }
    
    
    public static float get_shortest_path(String path){
        int x = 0, y = 0;
        for(int i=0;i<path.length();i++){
            // North #up
            if(path.charAt(i) == 'N'){
                y++;
            }
            // South #down
            else if(path.charAt(i) == 'S'){
                y--;
            }
            // East #right
            else if(path.charAt(i) == 'E'){
                x++;
            }
            // west #left
            else{
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2 + Y2);
    }


    public static String getSubString(String str, int si, int ei){
        String new_str = "";
        for(int i=si;i<ei;i++){
            new_str += str.charAt(i);
        }
        return new_str;
    }

    public static void main(String[] args) {
        // String str = "HelloWorld";
        // inbuilt method
        // System.out.println(str.substring(0,5));
        // System.out.println(getSubString(str, 0, 5));




        // lexicogrpic compare

        String fruits[] = {"apple", "banana", "mango", "cheeku", "kiwi"};

        String lagrest = fruits[0];
        // O(x * N)
        for(int i=1;i<fruits.length;i++){
            if (lagrest.compareTo(fruits[i]) < 0) {
                lagrest = fruits[i];
            }
        }

        System.out.println(lagrest);
    
    
    
    }
}
    // public static void main(String[] args) {
        // char ch[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");


        // Stirings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // input :- Tony 
        // output :- Tony
        // input:- Tony stark
        // O/P :- Tony
        // System.out.println(name);


        // input:- Tony stark
        // O/P:- Tony stark
        // String new_name = sc.nextLine();
        // System.out.println(new_name);


        // String full_name = "Tony Stark";
        // System.out.println(full_name.length());
        
        
        // concatination
        // String name = "Prathamesh";
        // String s_name = "Jadhav";
        // String full_name = name + " " + s_name;
        // System.out.println(full_name);

        // System.out.println(name.charAt(0));

        // print_letters(full_name);

       
        // Print the result
        // System.out.println(result);  // Output: HelloWorld123
        // System.out.println(check_string_is_palindrome("badyab"));

        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    
    

        // String path = "WNEENESENNN";
        // System.out.println(get_shortest_path(path));








        // equals function
        // these upper two variables are pointing to same strings
        //  == equal to operators are checking only the same string objects
        //equals() function checks proper value in that variable 

        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");


        // if (s1.equals(s3)) {
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
    // }

