package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please write a word and we will show you the reserved one: ");
        String word = new Scanner(System.in).next();

        // solution with StringBuffer (thread-safe)
        //String reverse = new StringBuffer(word).reverse().toString();
        //System.out.println("The reversed version of " + word + " is: " + reverse);

        // solution with StringBuilder
        //String reverse = new StringBuilder(word).reverse().toString();
        //System.out.println("The reversed version of " + word + " is: " + reverse);

        // solution with own method
        String reserve = reserve(word);
        System.out.println("The reversed version of " + word + " is: " + reserve);
    }

    public static String reserve(String x){

        if ((x == null) || x.isEmpty()){
            return x;
        }
        String reserve = "";
        for (int i = x.length() -1; i >= 0; i--){
            reserve = reserve + x.charAt(i);
        }

        return reserve;

    }


}
