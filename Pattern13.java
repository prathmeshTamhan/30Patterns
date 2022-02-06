// Enter n
// 5
// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;
public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(i);
           }
           System.out.println();
       }
       
    }

}