// Enter n
// 5
// 1 
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1

import java.util.Scanner;
public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print((i-j+1) + " ");
           }
           System.out.println();
       }
       
    }

}