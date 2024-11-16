public class Polymorphism {
   

    public static void main(String[] args) {
        // Run time (Dynamic)
            // Method Overriding
        // Deer d1 = new Deer();
        // d1.eat();

        // Compile time (Static)
            // Method Overloading
    
        Calculator calc = new  Calculator();
        System.out.println(calc.sum(23, 10));
        System.out.println(calc.sum(23, 10, 12));
        System.out.println(calc.sum(23.6f, 10.2f));

    }
}

/*
   Run time (Dynamic)

        Method Overriding
*/


class Animals{
    void eat(){
        System.out.println("Eat anything");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("Eats grass");
    }
}

 // Compile time (Static)
        // Method Overloading
    

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}