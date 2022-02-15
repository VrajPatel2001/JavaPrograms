package com.problems;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 5, 7, 1, 1};
        int[] result = missingNumbers(arr,7);
        System.out.println(Arrays.toString(result));


    }

   static int[] missingNumbers(int[] nums, int n) // this will find missing numbers in an array
    {
        int[] result;
        result = new int[n];
        int index=0;
        for(int i=1; i< n+1;i++)
        {
            if(!contains(nums,i))
            {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    private static boolean contains(int[] nums, int number) { //this will find specific number in an array
        boolean isContain = false;
        for (int num : nums)
            if (number == num) {
                isContain = true;
                break;
            }
        return isContain;
    }
}


