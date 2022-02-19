package com.problems;

public class PerfectNumber {
    // 6 --> 1 + 2 + 3 = 6
    // 8 --> 1 + 2 + 4 != 8 not perfect
    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }

    static boolean isPerfect(int n)
    {
        int sum =0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }

        return n == sum;
    }
}
