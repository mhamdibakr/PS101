package com.ps;

import java.util.Scanner;

public class Arrays
{
    public static void fillArray(int[] array, int size)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ;  i < size ; i++)
        {
            System.out.println("Enter the value of ["+i+"]");
            array[i] = scanner.nextInt();

        }
    }

    public static void printArray(int[] array)
    {
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void sumArray(int [] array)
    {
        int res = 0;
        for(int i = 0 ; i < array.length ; i++)
        {
            res += array[i];
        }
        System.out.println("the sum of the array elements is "+ res);
    }

    public static void avgArray(int[] array)
    {
        double res = 0.0;
        for (int i = 0 ; i < array.length ; i++)
        {
            res += array[i];
        }
        res /= array.length;
        System.out.println("the avg of the array elements is "+ res);
    }

    public static void largestAndSmallest(int[] array)
    {
        int lar = Integer.MIN_VALUE, sma = Integer.MAX_VALUE;
        int indexLar = 0, indexSma = 0;
        for (int i = 0 ; i < array.length ; i++)
        {
            if(array[i] > lar)
            {
                lar = array[i];
                indexLar = i;
            }

            if(array[i] < sma)
            {
                sma = array[i];
                indexSma = i;
            }
        }
        System.out.println("the largest element of the array is "+lar+" and it index is "+indexLar);
        System.out.println("the smallest element of the array is "+sma+" and it index is "+indexSma);
    }



}
