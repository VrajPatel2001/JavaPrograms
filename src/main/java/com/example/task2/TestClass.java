package com.example.task2;

import java.lang.reflect.Array;
import java.util.*;

public class TestClass {


    public static void main(String[] args) {

        List<Double> array = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        double x;
        System.out.println("Enter the numbers to store in Array and enter 0 to end inputs:");
        while((x=in.nextDouble()) != 0) // can be changed
        {
            array.add(x);
        }
       // System.out.println(array);


        ArrayProcessor maximum =  arrayM-> {
                double max=0;
                for (double a: arrayM)
                {
                    if(a > max)
                    {
                        max = a;
                    }
                }
                return max;

        };

        ArrayProcessor minimum =  arrayM-> {

            double min=arrayM[0];
            for (double a: arrayM)
            {
                if(a < min)
                {
                    min = a;
                }
            }
            return min;

        };

        ArrayProcessor sum =  arrayM-> {
            
           double total = 0;
           for(double d: arrayM)
           {
               total+= d;
           }

           return total;
           
        };


        ArrayProcessor average =  arrayM-> {
            double total = 0;
            for(double d: arrayM)
            {
                total+= d;
            }

            return total/arrayM.length;


        };

        double[] arr =  array.stream().mapToDouble(i -> i).toArray();

        System.out.println("Maximum number is " +  maximum.operator(arr));
        System.out.println("Minimum number is " + minimum.operator(arr));
        System.out.println("Sum is " + sum.operator(arr));
        System.out.println("Average is " + average.operator(arr));


        ArrayProcessor occuranceOf2 = counter(2);

        System.out.println("Occurance of 2 is:" +occuranceOf2.operator(arr));
    }

    public static ArrayProcessor counter(double value )
    {
        return arrayM -> {
            double occur =0;
            for(double a : arrayM)
            {
                if(a == value)
                    occur++;
            }
            return occur;
        };
    }


}
