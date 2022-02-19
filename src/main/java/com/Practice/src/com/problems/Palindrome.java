package com.problems;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // if the number's reverse number is also same then number is palindrome
    }
    static boolean isPalindrome(int num){
        int r , s=0;
        int temp = num;
        while(temp > 0)
        {
            r = temp%10;
            temp = temp/10;
            s = (s*10) + r;
        }

        System.out.println(s);
        return num == s;
    }


}


