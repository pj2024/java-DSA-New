public class Sortingalgo {
    
    // bubble sorting algorithum
    // O(n^2)
    public static void bubble_sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swaps = 0;
            for(int j=0;j<arr.length-1-turn;j++){
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }
    



    // selection sort algorithum
    // O(n^2)
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_pos = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min_pos] > arr[j]) {
                    min_pos = j;
                }
            }

            // swap
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
    }



    public static void selection_sort_sec(int nums[]){
        int new_arr[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            int min_pos = i;
            for(int j=i+1;j<nums.length;j++){
                if (nums[min_pos] > nums[j]) {
                    min_pos = j;
                }
            }

            int temp = nums[min_pos];
            nums[min_pos] = nums[i];
            nums[i] = temp;
        }

        for(int i=0;i<new_arr.length;i++){
             new_arr[i] = nums[i];
        }
        
        print_arr(new_arr);
    }

    // for printing array
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   




    // O(n)
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct possition to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }






    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(arr[i], largest);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) { 
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        // bubble sort 
        // int num[] = {15, 14, 11, 13, 12};
        // int num[] = {1, 2, 3, 4, 5};
        // bubble_sort(num);

        // selection_sort(num);
        
        // selection_sort_sec(num);

        // insertion_sort(num);

        
       int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        //    count the frequency
       counting_sort(arr);
       print_arr(arr);

    }
}
