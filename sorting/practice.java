public class practice {

    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_pos = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[min_pos] < arr[j]) {
                    min_pos = j;
                }
            }

            // swap
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
    }
   
   
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct possition to insert
            while (prev >= 0 && arr[prev] < curr) {
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
        for(int i=count.length-1;i>=0;i--){
            while (count[i] > 0) { 
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubble_sort(arr);
        // 8 7 6 5 4 3 3 2 1 1
        
        // selection_sort(arr);
        // 8 7 6 5 4 3 3 2 1 1


        // insertion_sort(arr);
        // 8 7 6 5 4 3 3 2 1 1

        // counting_sort(arr);
        // 8 7 6 5 4 3 3 2 1 1
        print_arr(arr);
    }
}
