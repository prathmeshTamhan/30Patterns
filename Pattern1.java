
// Enter n
// 5
// * * * * * 
// * * * * *
// * * * * *
// * * * * * 
// * * * * *
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.print("\n");
        }

    }

}