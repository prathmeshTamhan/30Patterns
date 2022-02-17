// Enter n
// 5
//         1 
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // to print spaces(1st triangle)
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            // to print 2nd triangle
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            // to print 3rd triangle
            for (int k = 1; k <= i; k++) {
                System.out.print((i - k + 1) + " ");
            }
            System.out.println();

        }

    }

}