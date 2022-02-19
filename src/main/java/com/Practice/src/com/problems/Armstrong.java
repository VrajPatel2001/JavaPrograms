package com.problems;

public class Armstrong {

    // 153 --> 1*1*1 + 5*5*5 + 3*3*3 == 153 Armstrong Number

    public static void main(String[] args) {
        System.out.println(isArmstrong(370));
    }

    static boolean isArmstrong(int n){
        int temp = n, r;
        int sum =0;

        while(temp>0){
            r = temp%10;
            temp = temp/10;
            sum = sum + r*r*r;
        }
        return sum == n;
    }
}
