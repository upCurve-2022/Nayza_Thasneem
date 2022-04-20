/*Q6: Write a program to separate the Whole number and Fraction value from double and store
it in separate variables.
Example:
Input: 10.25
Output: 10 25*/
import java.util.Scanner;
public class decimalSplit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        int w=(int)n;
        int f=(int)((n-w)*100);
        System.out.println(w+" "+f);
    }
}
