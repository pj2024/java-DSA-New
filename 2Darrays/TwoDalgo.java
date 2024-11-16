import java.util.ArrayList;
import java.util.List;

public class TwoDalgo {


    public static void spiral_matrix(int matrix[][]){
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;

        while (start_row <= end_row && start_col <= end_col) { 
            // top   start_col --> end_col    ++   //const:start_row
            for(int j=start_col;j<=end_col;j++){
                System.out.print(matrix[start_row][j] + " ");
            }
           
            // right start_row+1 --> end_row  ++  //const:end_col
            for(int i=start_row+1;i<=end_row;i++){
                System.out.print(matrix[i][end_col] + " ");
            }

            // bottom  end_col-1 --> start_col -- //const: end_row
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row == end_row){
                    break;
                }
                System.out.print(matrix[end_row][j] + " ");
            }

            // left   end_row-1 --> start_row+1  -- //const:start_col
            for(int i=end_col-1;i>=start_row+1;i--){
                if (start_col == end_col) {
                    break;
                }
                System.out.print(matrix[i][start_col]+" ");
            }



            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
        System.out.println();
    }


    public static  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> nums = new ArrayList<>();
        int start_row = 0; 
        int end_row = matrix.length-1;
        int start_col = 0; 
        int end_col = matrix[0].length-1;

        while(start_row <= end_row && start_col <= end_col){
             // top   start_col --> end_col    ++   //const:start_row
             for(int j=start_col;j<=end_col;j++){
                nums.add(matrix[start_row][j]);
            }
           
            // right start_row+1 --> end_row  ++  //const:end_col
            for(int i=start_row+1;i<=end_row;i++){
                nums.add(matrix[i][end_col]);
            }

            // bottom  end_col-1 --> start_col -- //const: end_row
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row == end_row){
                    break;
                }
                nums.add(matrix[end_row][j]);
            }

            // left   end_row-1 --> start_row+1  -- //const:start_col
            for(int i=end_row-1;i>=start_row+1;i--){
                if (start_col == end_col) {
                    break;
                }
                nums.add(matrix[i][start_col]);
            }



            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
        System.out.println(nums);
        return nums;
    }
    
    
    
    public static int diagonal_sum(int matrix[][]){
        int dig_sum = 0;

        // O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if (i == j) {
        //             dig_sum += matrix[i][j];
        //         }
        //         else if (i + j == matrix.length-1) {
        //             dig_sum += matrix[i][j];
        //         }
        //     }
        // }


        // O(n)

        for(int i=0;i<matrix.length;i++){
            // pd
            dig_sum += matrix[i][i];

            // sd
            if (i != matrix.length-1-i) {
                dig_sum += matrix[i][matrix.length-1-i];
            }
        }
        return dig_sum;
    }
    


    public static boolean search_in_sorted_matrix(int matrix[][],int key){
        //    O(n^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if (matrix[i][j] == key) {
        //             System.out.println("The keys is at ("+i+","+j+")");
        //         }
        //     }
        // }

        // int n = matrix.length;
        // int m = matrix[0].length;

        // (n-1,0) -->(3,0)
        // if key < cellval --> top
        // if key > cellval --> right

        // (0,m-1) -->(0,3)
        // if key < cellval --> left
        // if key > cellval --> bottom



        // right top-most element



        // int row = 0, col = matrix.length-1;

        // while (row < matrix.length && col >= 0) { 
        //     // found
        //     if(key == matrix[row][col]){
        //         System.out.println("The key found at ("+row+","+col+")");
        //         return true;
        //     }
        //     else if (key < matrix[row][col]) {
        //         // left
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key not found!");
        // return false;



        // left-bottomest element
        // O(n+m)
        int row = matrix[0].length-1,col = 0;

        while (row >= 0 && col < matrix[0].length) { 
            // found
            if(matrix[row][col] == key){
                System.out.println("The key found at ("+row+","+col+")");
                return true;
            }
            else if(key > matrix[row][col]){
                // right
                col++;
            }
            else{
                // top
                row--;
            }
        }
        System.out.println("Key not found!");
        return false;


    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        // spiral_matrix(matrix);

        // spiralOrder(matrix);
        // System.out.println(diagonal_sum(matrix));



        int matrix2[][] ={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search_in_sorted_matrix(matrix2, 29);
    }
}
