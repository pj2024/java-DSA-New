public  class StarPattern {

    // *
    // **
    // ***
    // ****
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // ****
    // ***
    // **
    // *
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=(n-i+1);j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // 1
    // 12
    // 123
    // 1234
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }




    // A
    // BC
    // DEF
    // GHIJ
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}