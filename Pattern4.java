// Enter n
// 5
//  * * * *
//  * * *
//  * *
//  *

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");

            for (int j = 1; j <= (n - i+1); j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
