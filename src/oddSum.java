/*Q8: Write a program to calculate the sum of
(a) Odd numbers from 1- N.*/
import java.util.Scanner;
public class oddSum {
     public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int sum=0;
            for(int i=1;i<n;i++)
                sum= sum+((i % 2 != 0) ? i : 0);
            System.out.print(sum);
     }
}
