package Basic.Patterns;

import java.util.Scanner;

public class HillPattern {
    private static void HillPrint(int n) {
        for (int i = 1; i<=n ; i++) { 
            for (int j = i; j<=n; j++) {
               System.out.print(" ");
            }
            for (int j = 1; j< i; j++) { 
               System.out.print("* ");
            }
            for (int j = 1; j<=i; j++) {
               System.out.print("* ");
            }
            System.out.println();
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();
            HillPrint(number);
        } 
}
