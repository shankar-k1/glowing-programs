package Java.Patterns;

import java.util.Scanner;

public class DecreasingTriangle {
    private static void DecreasingTrianglePattern(int n) {
        int i,j;
            for(i=1;i<=n;i++){
                for(j=i;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();
            DecreasingTrianglePattern(number);
        } 
}
