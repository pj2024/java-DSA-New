
public class Classroom{
    public static int multiplication(int a, int b){
        int mul = a * b;
        return mul;
    }


    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i; 
        }
        return f;
    }


    public static int binomialCo(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int bi = fact_n/(fact_r*fact_nmr);
        return bi;
    }


    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }

        for(int i=2;i<=num-1;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


    public  static boolean isPrimeOpti(int n){
        if(n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2; i<=n-1;i++){
            if(isPrimeOpti(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first value: ");
        // int a = sc.nextInt();
        // System.out.print("Enter second value: ");
        // int b = sc.nextInt(); 
        // int mul = multiplication(a, b);
        // System.out.println("The multiplication of "+ a + " and "+ b +" is " + mul);

        // System.out.print("Enter a number you want to find that factorial: ");
        // int n = sc.nextInt();
        // int fact = fact(n);
        // System.out.println("The factorial of "+ n + " is " + fact);        
        
        // System.out.println(binomialCo(5, 2));

        // int num = 4;
        // if(isPrime(num)){
        //     System.out.println("The number "+ num + " is prime number.");
        // }else{
        //     System.out.println("The number "+ num + " is not prime number.");
        // }

        // if(isPrimeOpti(num)){
        //     System.out.println("The number "+ num + " is prime number.");
        // }else{
        //     System.out.println("The number "+ num + " is not prime number.");
        // }

        primesInRange(20);
    }
}