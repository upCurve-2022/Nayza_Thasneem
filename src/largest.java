/*Q7: Write a Program to find the largest and second largest of 3 numbers.
Input: 10 5 25
Output: largest: 25
Second largest: 10*/
import java.util.Scanner;
public class largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int lar = a, slar = b;
        if (a > b && a < c) {
            lar = a;
            if (b > c)
                slar = b;
            else
                slar = c;
        } else if (b > a && b > c) {
            lar = b;
            if (a > c)
                slar = a;
            else
                slar = c;
        } else {
            lar = c;
            if (a > b)
                slar = b;
            else
                slar = a;
        }
        System.out.println("Largest:" + lar);
        System.out.print("Second Largest:" + slar);
    }
}
