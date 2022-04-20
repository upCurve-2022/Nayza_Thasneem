/*Q23: Write the program to print below mentioned series.
1, -2, 4, -6, 7, -10, 10, -14 ..............N*/
import java.util.Scanner;
public class series2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int Arr[] = new int[n];
        Arr[0] = 1;
        Arr[1] = -2;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0)
                Arr[i] = Arr[i - 2] + 3;
            else
                Arr[i] = Arr[i - 2] - 4;
        }
        for (int i = 0; i < n; i++)
            System.out.print(Arr[i]+" ");
    }
}