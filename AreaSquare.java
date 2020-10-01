package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TO FIND AREA OF SQUARE
        Scanner side = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat(".##");
        System.out.println("Enter Side Of Square = ");
        float s =side.nextFloat();
        float area = (s*s);
        System.out.print("Area ="+df.format(area));

    }
}
