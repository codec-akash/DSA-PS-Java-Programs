import java.util.Scanner;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev= reverse(n);
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }

    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int r= n%10;
            n=n/10;
            rev = rev*10 + r;
        }
        return rev;
    }
}