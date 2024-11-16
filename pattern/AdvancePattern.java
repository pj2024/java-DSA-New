public class AdvancePattern {
//      *
//     **
//    ***
//   ****
    public static void invRotHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // for start printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    // 12345
    // 1234
    // 123
    // 12
    // 1
    public static void inv_half_pyramid_with_numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    
    // 1 
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void floyds_triangle(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }


    // 1
    // 01
    // 101
    // 0101
    // 10101
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    // *    *
    // **  **
    // ******
    // ******
    // **  **
    // *    *

    public static void butterfly_pattern(int n){
        // outer loop - upper pattern
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        // lower-pattern
        for(int i=n;i>=1;i--){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
   
   
    //      *****
    //     *****
    //    *****
    //   *****
    //  *****

    public static void solid_rohumbus(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //      *****
    //     *   *
    //    *   *
    //   *   *
    //  *****
    public static void hollow_rohumbus(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *
    public static void dimond_pattern(int n){
        // outer loop-upper
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower pattern
        for(int i=n;i>=1;i--){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    //      1 
    //     2 2
    //    3 3 3
    //   4 4 4 4
    public static void number_pyramid(int n) {
        // outer loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    //         1 
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

    public static void palindromic_pattern_with_numbers(int n) {
        // outer loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }

            // decending series
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            // assending series
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        // invRotHalfPyramid(4);

        // inv_half_pyramid_with_numbers(5);

        // floyds_triangle(5);

        // zero_one_triangle(5);

        // butterfly_pattern(3);

        // solid_rohumbus(5);

        // hollow_rohumbus(5);

        // dimond_pattern(4);

        // number_pyramid(5);

        palindromic_pattern_with_numbers(5);
    }
}
