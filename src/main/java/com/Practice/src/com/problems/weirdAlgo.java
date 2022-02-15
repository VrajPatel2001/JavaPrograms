package com.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class weirdAlgo {
//https://cses.fi/problemset/task/1068/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;

       // System.out.println("Enter a positive number: ");
        input = in.nextInt();

        if(input <= 0)
        {
            System.out.println("Input positive number");
        }
        else
        {
            ArrayList<Integer> possibleValues = new ArrayList<>(5);
            possibleValues.add(input);

            while (input != 1)
            {
                if(input % 2 == 0)
                {
                    input = input /2;
                }
                else{
                    input = (input * 3) + 1;
                }
                possibleValues.add(input);
            }

          for(int a:possibleValues)
          {
              System.out.print(a + " ");
          }
           // System.out.println(possibleValues);
        }


    }
}
