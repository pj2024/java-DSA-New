package overloading;

public class Functions {


    // function overloading using parameters

    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }


    // overloaading using datatypes
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        // System.out.println(sum(10, 5));
        // System.out.println(sum(10,15,20));

        System.out.println(sum(10, 15));
        System.out.println(sum(10.5f, 15.8f));
    }
    
}