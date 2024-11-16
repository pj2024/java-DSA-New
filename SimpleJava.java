/**
 * SimpleJava
 */
public class SimpleJava {
    
    public static int reverseNum(int num){
        int newNum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            newNum = (newNum * 10) + last_digit;
            num /= 10;
        }
        return newNum;
    }
    

    public static int sumIsPalindrome(int num){
        int sum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            sum += last_digit;
            num /= 10;
        }

        int original_sum = sum;
        int newNum = 0;
        while (sum > 0) { 
            int last = sum % 10;
            newNum = newNum * 10 + last;
            sum /= 10;
        }

        if (original_sum == newNum) {
            return 1;
        }else{
            return 0;
        }
    }

    public static void replaceKthelement(int arr[], int k){
        int start = arr[k-1];
        int end = arr[arr.length - k];

        arr[k-1] = end;
        arr[arr.length - k] = start;
    }
    public static void main(String[] args) {
        // System.out.println(reverseNum(200));
        // System.out.println(sumIsPalindrome(98));
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arr2[] = {5, 3, 6, 1, 2};
        int k = 2;
        replaceKthelement(arr2, k);
        for(int i=0; i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }   
}