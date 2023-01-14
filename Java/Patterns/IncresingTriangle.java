package Java.Patterns;

import java.util.Scanner;

public class IncresingTriangle {
    private static void IncresingTrianglePattern(int n) {
    int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        IncresingTrianglePattern(number);
    }  
}
