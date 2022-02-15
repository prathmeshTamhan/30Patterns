// Enter n
// 5
//  55555
//   4444
//    333
//     22
//      1

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        
        for (int i = n; i >= 1; i--) {
            for (int space = n; space >= i; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}