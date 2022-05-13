package com.ps;

import java.util.Scanner;

public class Arrays
{
    public static void fillStringArray(String[] array)
    {
        Scanner scanner = new Scanner(System.in);
        String input ;
        for(int i = 0 ; i < array.length ; i++)
        {
            input = "\0";
            System.out.println("Enter a value : ");
            input = scanner.next();

            array[i] = input;
        }
    }

    public static void fillIntArray(int[] array)
    {
        Scanner scanner = new Scanner(System.in);
        int input;
        for(int i = 0 ; i < array.length ; i++)
        {
            input = '\0';
            System.out.println("Enter a number : ");
            input = scanner.nextInt();
            array[i] = input;
        }
    }

    public static void printStringArray(String[] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void printIntArray(int[] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void arrayOps(int[] array)
    {
        int sum = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i = 0 ; i < array.length ; i++)
        {
            sum += array[i];

            if(array[i] > largest)
                largest = array[i];

            if(array[i] < smallest)
                smallest = array[i];
        }
        System.out.println("The sum of all arrays elements is "+sum+" \nThe largest elements of the array is " +largest
                +" and the smallest is "+smallest);
    }

    public static void cloneArray(int[] array1, int[] array2)
    {
        if(array1.length != array2.length)
            System.out.println("couldnt be done, both arrays should have the same size");
        else
        {
            for (int i = 0 ; i < array1.length  ; i++)
            {
                array2[i] = array1[i];
            }
        }
    }

    public static void cloneArrayInReverse(int[] array1, int[] array2)
    {
        if(array1.length != array2.length)
            System.out.println("couldnt be done, both arrays should have the same size");
        else
        {
            for (int i = array1.length - 1 ; i >= 0  ; i--)
            {
                array2[array2.length - 1 - i] = array1[i];
            }
        }
    }

    public static void reverseArray(int[] array)
    {
        int temp, size = array.length - 1;
        for(int i = 0 ; i <= size / 2 ; i++)
        {
            temp = array[i];
            array[i] = array[size - i];
            array[size - i] = temp;
        }
        printIntArray(array);
    }

    public static void linearSearch(int[] array, int number)
    {
        boolean isFound = false;
        int index = '\0';
        for(int i = 0 ; i < array.length ; i++)
        {
            if(array[i] == number)
            {
                isFound = true;
                index = i;
                break;
            }

        }

        if(isFound)
            System.out.println(number+" is found and it index is "+index);
        else
            System.out.println("Not found 404");
    }

    public static void bubbleSort(int[] array)
    {
        int temp ;
        for(int i = 0 ; i < array.length - 1; i++)
        {
            for(int k = 0 ; k < array.length- i - 1 ; k++)
            {
                if(array[k] > array[k + 1])
                {
                    temp = array[k];
                    array[k] = array[k+1];
                    array[k+1]= temp;
                }
            }
        }
        printIntArray(array);
    }

    //selction sort
    public static void selectionSort(int[] array)
    {
        int temp = '\0';
        for(int i = 0 ; i < array.length - 1; i++)
        {
            for(int j = 0 ; j < array.length - i - 1 ; j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j]   = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        printIntArray(array);
    }

    // merge 2 arrays
    public static void mergeTwoArrays(int[] array1, int[] array2)
    {
        int size = array1.length;
        int[] array3 = new int[size];

        if(array1.length != array2.length)
        {
            throw new RuntimeException("Both Arrays size should be the same");
        }
        else
        {
            for(int i = 0 ; i < array1.length || i < array2.length ; i++)
            {
                array3[i] = array1[i] + array2[i];
            }
            printIntArray(array3);
        }
    }

    public static void mergeTwoArrays2(int[] array1, int[] array2)
    {
        int size = array1.length + array2.length ;
        int[] array3 = new int[size];
        for (int i = 0 ; i < array1.length ; i++)
        {
            array3[i] =  array1[i];
        }

        for (int i = 0; i < array2.length ; i++)
        {
            array3[array1.length + i] = array2[i];
        }

        printIntArray(array3);
    }
}
