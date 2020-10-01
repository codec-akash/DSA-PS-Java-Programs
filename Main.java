package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(new Main());

        for (Object i : list){
            System.out.println(i);
        }
    }
}







