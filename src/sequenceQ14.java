/*Q14: Write a program to display the number in following sequence.
1, 4, 7, 12, 23 ................ N*/
import java.util.Scanner;
public class sequenceQ14 {
        public static void main(String arg[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter N: ");
            int n= sc.nextInt();
            int a=1,b=4,c=7;
            System.out.print(a+" "+b+" "+c);
            for(int i=4;i<=n;i++){
                int next=a+b+c;
                System.out.print(" "+next);
                a=b;    b=c;    c=next;
            }
        }

    }
