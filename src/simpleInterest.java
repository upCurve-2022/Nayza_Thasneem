/*Q3: Write a simple Program to calculate the Simple Interest.*/
import java.util.Scanner;
public class simpleInterest {
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        int p=sc.nextInt();
        System.out.print("Enter the rate of interest:");
        int r=sc.nextInt();
        System.out.print("Enter the time in years:");
        int t=sc.nextInt();
        float si=(p*r*t)/100;
        System.out.println("Simple Interest :"+si);
    }
}
