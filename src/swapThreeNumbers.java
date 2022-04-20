/*Q4: (b) Write a program to swap 3 numbers.*/
import java.util.Scanner;
public class swapThreeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a;
        a=b;
        b=c;
        c=temp;
        System.out.print("Swapped Numbers :" + a + " " + b + " " +c);

    }
}
