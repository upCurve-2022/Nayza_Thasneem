/*Q15: Write a program to display the number in following sequence.
1, 4, 9, 25, 36, 49 ..................N*/
import java.util.Scanner;
public class squares {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++)
            System.out.print(i*i+" ");
    }
}
