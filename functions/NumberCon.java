public class NumberCon {

    // binary number to decimal number converstion
    public static int binToDec(int binNum){
        int pow = 0;
        int lastNum;
        int decNum=0;

        while(binNum > 0){
            // take last digit
            lastNum = binNum % 10;
            // last digit + 2^pow
            decNum += lastNum * (int)Math.pow(2, pow);
            binNum = binNum / 10;
            pow++;
        }

        return decNum;

    }
    
    
    public static int decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
    
        while (decNum > 0) { 
            int rem = decNum % (rem* (int)Math.pow(10, pow));

            decNum = decNum / 2;
            pow++;
        }
        return binNum;
    }
    public static void main(String[] args) {
        // int binNum = 1000;
        // System.out.println("The decimal number of " + binNum +  " is " + binToDec(binNum));
        
        int decNum = 7;
        System.out.println("The binary number of " + decNum +  " is " + decToBin(decNum));
    }
}
