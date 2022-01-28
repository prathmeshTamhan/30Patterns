// Enter n
// 10
//          *
//         **
//        ***
//       ****
//      *****
//     ******
//    *******
//   ********
//  *********
// **********
//  *********
//   ********
//    *******
//     ******
//      *****
//       ****
//        ***
//         **
//          *


import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
