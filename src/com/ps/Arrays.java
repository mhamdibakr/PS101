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

}
