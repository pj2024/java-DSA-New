
import java.util.Scanner;

public class Matrices {

    public static boolean findKey(int matrix[][], int key){
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (matrix[i][j] == key) {
                    System.out.println("The key is at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }



    public static int largest_elem_in_matrix(int matrix[][]){
        int larest_elem = Integer.MIN_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] > larest_elem) {
                    larest_elem = matrix[i][j];
                }
            }
        }
        return larest_elem;
    }


    public static int smallest_elem_in_matrix(int matrix[][]){
        int smallest_elem = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] < smallest_elem) {
                    smallest_elem = matrix[i][j];
                }
            }
        }
        return smallest_elem;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // input
        // rows
        for(int i=0;i<n;i++){
            // cols
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // int key = 5;
        // findKey(matrix, key);


        System.out.println("The largest element of Matrix is: "+ largest_elem_in_matrix(matrix));       
        System.out.println("The smallest element of Matrix is: "+smallest_elem_in_matrix(matrix));
    }
}