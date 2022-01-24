//Enter n
//5
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {

            for (int j = 2 * (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
// or 
// for (int i = 1; i <= n; i++) {
//     for (int j = 0; j < n - i; j++) {
//         System.out.print(" ");
//     }

//     for (int j = 0; j < i; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }