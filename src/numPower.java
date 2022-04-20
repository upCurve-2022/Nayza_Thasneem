/*Q13: Write a program to display the number in following sequence.
1, 4, 27, 256, 3125 .............. N */
import java.util.Scanner;
public class numPower {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i<= n; i++) {
            int g = i,pow = 1;
            while (g > 0) {
                pow *= i;
                g--;
            }
            System.out.print(pow + " ");
        }
    }
}
