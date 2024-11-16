public class BitManipulation {
    public static void main(String[] args) {
        // AND
        // 0 & 0 => 0
        // 0 & 1 => 0
        // 1 & 0 => 0
        // 1 & 1 => 1  

        // 5 = 101  // 6 = 110 ==> 101 & 110 = 100 ==> 4

        System.out.println(5 & 6);   // 4
        // OR
        // 0 | 0 => 0
        // 0 | 1 => 1
        // 1 | 0 => 1
        // 1 | 1 => 1 
        
        // 5 = 101  // 6 = 110 ==> 101 | 110 = 111 ==> 7
        
        System.out.println(5 | 6);   // 7

        // XOR
        // 0 ^ 0 => 0
        // 0 ^ 1 => 1
        // 1 ^ 0 => 1
        // 1 ^ 1 => 0

        // 5 = 101  // 6 = 110 ==> 101 ^ 110 = 111 ==> 7
 
        System.out.println((5 ^ 6));


        // One's Compliment
        // ~0 => 1
        // ~1 => 0

        // 5 = 101 ==> 010 ==> 2  //but not it

        System.out.println((~0));


        // Binary left shift

        // a(00010101) << b(2) ==> 01010100


        // formula :--> a << b = a * 2^b 

        System.out.println(5<<2);
    
        // formula :--> a >> b = a / 2^b
        
        System.out.println(6>>1);
    }
}
