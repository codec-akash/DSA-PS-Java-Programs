package com.intuit.webs.java8;

public class RunnableLambdaInterface {

    //old-way annonymous class
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable run1");
            }
        };
        new Thread(runnable).start();

        //Lambda () -> {};
        Runnable runnable1 = () -> {
            System.out.println("inside runnable run2");
        };
        new Thread(runnable1).start();


        Runnable runnable2 = () -> System.out.println("inside runnable run2");

        //3rd way
        new Thread(() -> System.out.println("inside 3")).start();

    }



}
