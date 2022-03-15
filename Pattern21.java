// Enter n
// 5
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE


import java.util.Scanner;
public class Pattern21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int alphabet=65;
            for(int j=1;j<=n;j++){
                System.out.print((char)(alphabet+j-1));
            }
            System.out.println();
        }
    }
}