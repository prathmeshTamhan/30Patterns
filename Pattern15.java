// Enter n
// 5
// 1 
// 2 3
// 3 4 5
// 4 5 6 7
// 5 6 7 8 9

import java.util.Scanner;
public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();
       
       for(int i=1;i<=n;i++){
           int value=i;
           for(int j=1;j<=i;j++){
               System.out.print(value + " ");
               value++;
           }
           System.out.println();
       }
       
    }

}