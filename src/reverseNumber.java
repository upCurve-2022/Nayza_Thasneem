/*Q9: Write a program to reverse the number.
Input: 1234567890
Output: 0987654321*/
import java.util.Scanner;
public class reverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int r = 0;
        while (n > 0) {
            r=(r*10) + (n % 10);
            n /= 10;
        }
        System.out.print("Reversed Number: " + r);
    }
}
