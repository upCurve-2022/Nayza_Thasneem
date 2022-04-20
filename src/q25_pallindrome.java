/*Q26: Write a program to check if the given String is palindrome or not.*/
import java.util.Scanner;

public class q25_pallindrome {
    public static String reverseString(String str){
        String rstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rstr = ch + rstr;
        }
        return rstr;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        boolean flag=true;
        int l= str.length();
        for(int i=0, j=l-1; i<l/2; i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {          //this is case-sensitive
                flag = false;
                break;
            }
        }
        if(flag==true)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}