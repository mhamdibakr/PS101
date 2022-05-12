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
    }

    public static void printIntArray(int[] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}
