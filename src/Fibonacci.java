/*Q22: Write the program to print below mentioned series. (Fibonacci)
 1, 1, 2, 3, 5, 8, 13 ........... N */
import java.util.*;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 1, b = 1, c, i = 2;
        System.out.print(a + " " + b+" ");
        while (i < n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}