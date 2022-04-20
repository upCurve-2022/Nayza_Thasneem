/*Q8: Write a program to calculate the sum of
(b) Even numbers from 0 – N*/
import java.util.Scanner;
    public class evenSum {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int sum=0;
            for(int i=0;i<=n;i++)
                sum= sum+((i % 2 == 0) ? i : 0);
            System.out.print(sum);
        }
    }