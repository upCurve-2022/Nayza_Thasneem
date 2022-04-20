/*Q12: Write a program to display the number in following sequence.
-1, 2, -3, 4, -5........N */
import java.util.Scanner;
public class altSequence {
        public static void main(String arg[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            for (int i = 1; i<=n; i++) {
                int g= (i%2==0) ? i : -1*i;
                System.out.print(g + " ");
            }
        }
}
