package Basic.Patterns;

import java.util.Scanner;

public class InvertedHill {
    public static void InvertedHillPattern(int n){
        for (int i = 1; i<=n ; i++) { 
            for (int j = 1; j<=i; j++) { // increasing
               System.out.print(" ");
            }
            for (int j = i; j< n; j++) { // decreasing
               System.out.print("* ");
            }
            for (int j = i; j<=n; j++) { // decreasing
               System.out.print("* ");
            }
            System.out.println();
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        InvertedHillPattern(number);
    } 
}
