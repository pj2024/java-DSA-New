public class Practice {
    

    // Question 1 : Print the number of 7's that are in the 2d array.
    // Example
    // Input - int matrix[][] = {
        //     {4,7,8},{8,8,7}
        // };
    // Output - 2


    public static int count_return_number_of_times(int matrix[][],int key){
        int count = 0;
        
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == key) {
                    count++;
                }
           }
        }

        return count;
    }



    // Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
    // Example -
    // Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    // Output - 18


    public static int print_second_row_sum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix[0].length;i++){
            sum += matrix[1][i];
        }
        return sum;
    }


        // Question 3 : Write a program to Find Transpose of a Matrix.
        // What is Transpose?
        // Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,


        // Matrix
        // a11 a12 a13
        // a21 a22 a23

        // transpose
        // a11 a21
        // a12 a22
        // a13 a23


    public static void print_matrix(String matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void create_transpose_matrix(String matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        print_matrix(matrix);
        String tran_matrix[][] = new String[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tran_matrix[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        print_matrix(tran_matrix);
        

    }
    public static void main(String[] args) {
        // int key = 7;
        // int matrix[][] = {
        //     {4,7,8},{8,8,7}
        // };
        // System.out.println(count_return_number_of_times(matrix, key));



        // int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // System.out.println(print_second_row_sum(nums));
        
        String matrix[][] = {
            {"a11", "a12", "a13"},
            {"a21", "a22", "a23"}
        };
        create_transpose_matrix(matrix);
    }
}
