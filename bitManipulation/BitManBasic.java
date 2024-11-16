public class BitManBasic {
   
    public static void odd_or_even(int n){
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("ODD number");
        }else{
            System.out.println("EVEN number");
        }
    }


    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;

        if ((n & bitMask) == 0) {
           return 0;
        }else{
            return 1;
        }
    }


    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;

        return n | bitMask;
    }
   

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        
        return n & bitMask;
    }
    
    

    public static int updateIthBit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }


    public static int subsetXORSum(int[] nums) {
        int xor_sum = 0;

        for(int i=0; i<nums.length;i++){
            int start = i;
            for(int j=i; j<nums.length;j++){
                int end = j;

                for(int k=start; k<=end; k++){
                    xor_sum += nums[k] ^ nums[k];
                }
            }
        }

        return xor_sum;
    }



    
    public static void main(String[] args) {
        // odd_or_even(6);
        // odd_or_even(3);
        // odd_or_even(7);


        // System.out.println(getIthBit(10, 2));
    
        // System.out.println(setIthBit(10, 2));
 
 
        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // int nums[] = {1, 3};
        // System.out.println(subsetXORSum(nums));
    }
}
