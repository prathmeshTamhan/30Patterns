//Enter n
//5
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

import java.util.Scanner;

public class Pattern2 {
    public static void pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        pyramid(n);
    }

}
