public class Practice {

    // Question 1 :Write a Java method to compute the averageof three numbers.

    public static double average(int a, int b, int c){
        double sum = a + b + c;
        double avg = sum/3;
        return avg;
    }

    // Question2:WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }

        return false;
    }


    // Question3:WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.

    public static boolean isPalindrome(int n){
        int newNum = 0;
        int myNum = n;
        while (n != 0) { 
           int lastDigit = n % 10;
           newNum = newNum * 10 + lastDigit;
           
           n = n / 10;
        } 

        if(myNum == newNum){
            return true;
        }

        return false;
    }





    // Question 5 :Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:a.Take a variable sum = 0b.Find the last digit of the numberc.Add it to the sumd.Repeat a & b until the number becomes 0 )


    public static void computeTheSum(int n){
        int sum = 0;
        while (n != 0) { 
            int lastDigit = n % 10;
            sum += lastDigit;

            n = n / 10;
        }

        System.out.println("The computed sum is: "+ sum);
    }

    // Question 4 :READ&CODEEXERCISESearch about(Google) & use the following methods of the Math class in java
    // a.Math.min( )
    // b.Math.max( )
    // c.Math.sqrt( )
    // d.Math.pow( )
    // e.Math.avg( )
    // f.Math.abs( )

    public static void mathClassInJava(int x, int y){
        System.out.println("The minimum of " + x + " and "+ y + " is: "+ Math.min(x, y));
        System.out.println("The maximum of " + x + " and "+ y + " is: "+ Math.max(x, y));
        System.out.println("The square root of " + x + " is: "+ Math.sqrt(x) + " and The square root of "+ y + " is:"+ Math.sqrt(y));
        System.out.println("The power of "+ x + " res to "+ y + " is: "+ Math.pow(x, y));
    }

    public static void main(String[] args) {
            // System.out.println("The avg is: " + average(10, 40, 70));


            // int n = 10;
            // if(isEven(n)){
            //     System.out.println("The num "+ n + " is EVEN number.");
            // }else{
            //     System.out.println("The num "+ n + " is ODD number.");
            // }

            // System.out.println(isPalindrome(123));
            // System.out.println(isPalindrome(121));

            // computeTheSum(140903);

            mathClassInJava(10, 2);
    } 
}
