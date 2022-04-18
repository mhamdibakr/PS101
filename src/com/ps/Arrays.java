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

    public static void copyArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
    }

    public static void reverseArray(int[] array)
    {
        // Must redo it later in order to build reflexion
    }

    public static void sortArray(int[] array)
    {
        int temp = 0;
        int size = array.length - 1;
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = 0 ; j < size - i ;j++)
            {
               if(array[j] > array[j+1])
               {
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
            }
        }
        printArray(array);
    }

    public static void searchArray(int[] array, int element)
    {
        boolean isFound = false;
        int index = 0;
        System.out.println(array.length);
        for (int i = 0 ; i < array.length ; i++ )
        {
            if(array[i] == element)
            {
                isFound = true;
                index = i;
                break;
            }
        }
        if (isFound)
            System.out.println("element is found in this array on index "+index);
        else
            System.out.println("element does not exist in the array");

    }

}
