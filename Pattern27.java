
// Enter n
// 5
//      A 
//     A B
//    A B C
//   A B C D
//  A B C D E
// A B C D E F
import java.util.Scanner;

public class Pattern27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        int alphabet = 65;
        // int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}