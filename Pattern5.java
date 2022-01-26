// Enter n
// 5
//  *****
//   ****
//    ***
//     **
//      *
import java.util.Scanner;

public class Pattern5 {

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
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
