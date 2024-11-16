

public class Practice {
    // Question 1:Given an integer array nums, return true if any value appears at least twice in the
    // array, and return false if every element is distinct.
    // Example 1:
    // Input: nums = [1, 2, 3, 1]
    // Output: true
    // Example 2:
    // Input: nums = [1, 2, 3, 4]
    // Output: false

    public static boolean value_appers_twice(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }



    
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(value_appers_twice(nums));
    }


    // Question 2: There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[kl],nums[k+l], ... ,nums[n-l], nums[0], nums[l], nums[k-l]] (0-indexed). For example, [0,1, 2, 4, 5, 6, 7] might be rotated index 3 and pivot at become ,[4, 5, 6, 7, 0, 1, 2].

    // Example 1:
    // input: nums = {4, 5, 6, 7, 0, 1, 2}, target = 0
    // output: 4







   
}
