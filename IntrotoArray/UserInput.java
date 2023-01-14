package IntrotoArray;

import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the array elements:");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("ENter the elements to be inserted on the array : ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}