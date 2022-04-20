/*Q5: Write a program to Check if the given number is odd or even.*/
import java.util.Scanner;
public class oddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String g = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(n + " is " + g);
    }
}
