public class Algorithums {

    // TC = O(n)

    public static int linear_search(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
   
   
    public static int linear_search_strings(String str[], String key){
        for(int i=0;i<str.length;i++){
            if (str[i] == key) {
                return i;
            }
        }

        return -1;
    }
    
    

    public static int largest_element(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest; 
    }

    public static int smallest_element(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest; 
    }
    
    // O(log(n))
    public static int binary_search(int arr[], int key){
        int start = 0, end = arr.length-1;

        while (start<=end) { 
            int mid = (start+end)/2;
            if (arr[mid] == key) {
                return mid;
            }else if(key > arr[mid]){ //right
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // TC = O(n) SC = const
    public static void reverse_array(int arr[]){
        int start = 0, end = arr.length-1;
        while (start < end) { 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    // total_pairs_formula =n(n-1)/2 => 5(5-1)/2 =>10
    // O(n^2)
    public static void pairs_in_array(int arr[]){
        int tp=0;
        // outer loop
        for(int i=0;i<arr.length;i++){
            // inner loop
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i]+ ", "+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in array are: "+ tp);

    }
    

    // total_subarray_formula =n(n+1)/2 => 5(5+1)/2 =>10
    public static void print_sub_array(int arr[]){
        int ts = 0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total sub array are: "+ ts);
    }
    
    
    public static void print_sub_array_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int ts = 0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    sum += arr[k];
                }
                System.out.print(sum);
                if (max_sum < sum) {
                    max_sum = sum;
                }

                if (min_sum > sum) {
                    min_sum = sum;
                }
                ts++;
                System.out.println();
            }
            // System.out.println();
        }

        System.out.println("Total sub array are: "+ ts);
        System.out.println("The maximum sum is : "+max_sum);
        System.out.println("The minimum sum is : "+min_sum);
        
    }
   
   
    // O(n^3)
    public static int max_sub_array_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int curr_sum=0;
                for(int k=start;k<=end;k++){
                    curr_sum += arr[k];
                }
                System.out.println(curr_sum);
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }

        return max_sum;
    }
   
   
    public static int prefix_max_sub_array_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // creating prefix array
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        for(int i=0;i<arr.length;i++){
            int start=i;
            int curr_sum = 0;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            }
            System.out.println(curr_sum);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }

        return max_sum;
    }
   
   
   
//    O(n)

    public static void kadans_algo(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        System.out.println("The maximum sum is: "+ ms);
    }

    public static int smallest_negative_num(int arr[]){
        int smallest_num = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            if(smallest_num > curr){
                smallest_num = curr;
            }
        }

        return smallest_num;
    }





    public static int trapped_rain_water(int heights[]){
        int n = heights.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];

        // left max
        left_max[0] = heights[0];
        for(int i=1;i<left_max.length;i++){
            left_max[i] = Math.max(heights[i], left_max[i-1]);
        }

        // right max
        right_max[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            right_max[i] = Math.max(heights[i], right_max[i+1]);
        }


        int trapped_water = 0;
        for(int i=0;i<heights.length;i++){
            int water_level = Math.min(right_max[i], left_max[i]);
            trapped_water += water_level - heights[i];
        }

        return trapped_water;
    }










    // O(n)
    public static int buy_and_sell_stocks(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0;i<prices.length;i++){
            if(buy_price < prices[i]){
                int profit = prices[i] - buy_price;
                max_profit = Math.max(profit, max_profit);
            }else{
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
    // Linear search
    // int num[] = {2, 4, 6, 8, 10, 12, 14};
    // int key = 54;

    // int index = linear_search(num, key);
    // if (index == -1) {
    //     System.out.println("Key is not exist.");
    // }else{
    //     System.out.println("Key is at index: "+ index);
    // }

    
    // linear search on strings array
    // String str[] = {"dosa", "idly", "utapa", "upma", "bonde"};
    // String key = "utapa";
    // int index = linear_search_strings(str, key);
    // if(index == -1){
    //     System.out.println("Key not found");
    // }else{
    //     System.out.println("Key at index: "+ index);
    // }

    
    //largest smallest number 

    // int arr[] ={1, 2, 6, 3, 5};
    // int elemt = largest_element(arr);
    // System.out.println("The largest element is "+ elemt);
    // int elemt2 = smallest_element(arr);
    // System.out.println("The smallest element is "+elemt2);



    // binary search
    // int num[] = {2, 4, 6, 8, 10, 12, 14};
    // int key = 12;

    // System.out.println("The key is at index: "+ binary_search(num, key));
    


        // int arr[] = {2, 4, 6, 8, 10, 12};
        // reverse_array(arr);
        // print_arr(arr);
       
       
    //    print pairs
        // int arr[] = {2, 4, 6, 8, 10};
        // pairs_in_array(arr);


        // print subarray
        // int arr[] = {2, 4, 5, 6, 10};
        // print_sub_array_sum(arr);


        // max subarray sum
        // int num[] = {1, -2, 6, -1, 3};
        // System.out.println("The max subarray sum is: "+prefix_max_sub_array_sum(num));
   
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadans_algo(arr);

        // int arr[] = {-1, -2, -3, -4};
        // System.out.println(smallest_negative_num(arr));
   

         // trapped water
        // int heights[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trapped_rain_water(heights));



        // buyandSellstocks
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buy_and_sell_stocks(prices));
    } 


}
