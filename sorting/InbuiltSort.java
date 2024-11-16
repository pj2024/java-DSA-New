import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void print_arr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // O(n logn) < O(n^2)
        // Arrays.sort(num);

        // Arrays.sort(arr,si,ei(non-inclusive));
        // Arrays.sort(num,0,3);
        
        // object type variable only works on
        Integer arr[] = {5, 4, 1, 3, 2};
        // Arrays.sort(arr, Collections.reverseOrder());
        // 5 4 3 2 1

        Arrays.sort(arr,0, 3, Collections.reverseOrder());
        // 5 4 1 3 2
        print_arr(arr);
    }
}
