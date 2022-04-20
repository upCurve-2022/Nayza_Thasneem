/*Q11: Write a program to display the number in following sequence.
4, 16, 36, 64.......N */
import java.util.Scanner;
public class evenSquares {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sq =4;
        for (int i = 4; sq<n; i = i + 2) {
            System.out.print(sq + " ");
            sq = i * i;
        }
    }
}