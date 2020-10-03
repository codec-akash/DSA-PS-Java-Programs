package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
       int x= s.nextInt();
       boolean rev=isPalindrome(x);
       if(rev==true)
        System.out.println("Number is pallindrome");
       else
           System.out.println("Number is not a pallindrome");
    }

//        static int reverse(int x) {
//            int rev = 0;
//            while (x != 0) {
//                int pop = x % 10;
//                x /= 10;
//                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//                rev = rev * 10 + pop;
//            }
//            return rev;
//        }
static boolean isPalindrome(int x) {
    int rev = 0;
    if(x<0)
        return false;
    int y=x;
    while (y != 0) {
        int pop = y % 10;
        y /= 10;
        rev = rev * 10 + pop;
    }
    if(x==rev)
    {
        return true;
    }
    return false;

}

}
