// Enter n
// 5
// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE

import java.util.Scanner;
public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int alphabet=65;
            for(int j=1;j<=n;j++){
                System.out.print((char)(alphabet+i-1));
            }
            System.out.println();
        }
    }
}