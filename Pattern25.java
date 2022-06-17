// Enter n
// 5
// A 
// B C
// D E F
// G H I J
// K L M N O

import java.util.Scanner;

public class Pattern25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        int alphabet = 65;
        // int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet) + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}