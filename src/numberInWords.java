/*Q10: Write a program to display numbers in words.
Input: 12344
Output: One Two Three Four Four*/
import java.util.Scanner;
public class numberInWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String num[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String word = "";
        while (n > 0) {
            word = num[n % 10] + " " + word;
            n /= 10;
        }
        System.out.print(word);
    }
}
