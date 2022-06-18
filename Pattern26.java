// Enter n: 
// 5
// A B C D E F 
// A B C D E
// A B C D
// A B C
// A B
// A
// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Sc.close();
       
        for (int i = n; i >= 0; i--) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}