/*Q24: Write the program to find the X to the power of n. (Without using inbuilt function)
Input: X = 2, n = 5
Output: 32 */
import java.util.*;
public class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int x = sc.nextInt();
        System.out.print("Enter n:");
        int n = sc.nextInt();
        //int r = ;
        System.out.println(pow(x, n));
    }

    public static int pow(int x, int n) {
        int result = 1;
        while(n!=0) {
            result *= x;
            n--;
        }
        return result;
    }

}

