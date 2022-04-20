/*Q2: Write the Java program to print the following pyramid.
Input: n=5
Output:
*
* *
* * *
* * * *
* * * * *
*/
import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n;i++){
            for(int j = n-i ; j > 1 ;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}