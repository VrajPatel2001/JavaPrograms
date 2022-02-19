package com.problems;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5 , b=6;
        b = a + b - (a=b);
        System.out.println(a + " " +b);
    }

}
