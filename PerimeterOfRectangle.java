package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH OF THE RECTANGLE : ");
        float l = scan.nextFloat();

        System.out.println("ENTER THE LENGTH OF THE RECTANGLE : ");
        float b = scan.nextFloat();

        float P = 2*(l+b);
        System.out.println("PERIMETER OF RECTANGLE IS " +P);



    }
}
