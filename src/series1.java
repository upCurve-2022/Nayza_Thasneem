/*Q21: Write the program to print below mentioned series.
1, -2, 6, -15, 31, -56 .............. N*/
import java.util.Scanner;
public class series1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int val=1;
        for(int i=1;i<n;i++){
            val+=(i-1)*(i-1);
            if(i%2==0)
                System.out.print("-"+val+" ");
            else
                System.out.print(val+" ");
        }
    }
}
