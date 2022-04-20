/*Q4: (a) Write a program to swap 2 numbers.*/
import java.util.Scanner;
public class swapTwoNumbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = b;
        b = a;
        a = temp;
        System.out.print("Swapped Numbers :" + a + " " + b);
    }
}
