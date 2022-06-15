// Enter n
// 5
// ABCDE
// BCDEF
// CDEFG
// DEFGH
// EFGHI

import java.util.Scanner;
public class Pattern23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
         int alphabet = 65;
        // int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (alphabet +i+j-2));
            }
            System.out.println();
        }
    }
}