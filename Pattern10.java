// Enter n
// 5
// 11111
// 22222
// 33333
// 44444
// 55555

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}