// Enter n
// 5
// ABCDE
// FGHIJ
// KLMNO
// PQRST
// UVWXY
import java.util.Scanner;

public class Pattern22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        int alphabet = 65;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (alphabet + count));
                count++;
            }
            System.out.println();
        }
    }
}