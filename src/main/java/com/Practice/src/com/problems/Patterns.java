package com.problems;

public class Patterns {

    public static void main(String[] args) {
        //output for following:
        //* * * *
        //*     *
        //*     *
        //* * * *
//        for(int i=0;i<4;i++)
//        {
//            for(int j =0;j<4;j++)
//            {
//                if(i==0 || i == 3 || j == 0 || j == 3)
//                {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //We want to display following
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1

//        for(int i = 1;i<=5;++i)
//        {
//            //System.out.println("value i:"+ i);
//            for(int j =1; j<=i;++j)
//            {
//
//                if((i+j)%2 == 0)
//                {
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        //We want the following output:
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5

        for(int i = 1;i<=5;++i)
        {
            //System.out.println("value i:"+ i);
            for(int j =1; j<=i;++j)
            {
                    System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
