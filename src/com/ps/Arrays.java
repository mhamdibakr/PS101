package com.ps;

import java.util.ArrayList;
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

        int sum = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, avg;
        for (int i = 0 ; i < array.length ; i++)
        {
            sum += array[i];

            if(array[i] > largest)
                largest = array[i];

            if(array[i] < smallest)
                smallest = array[i];
        }
        avg = sum / (array.length - 1);
        System.out.println("The sum of all arrays elements is "+sum+" \nThe largest elements of the array is " +largest
                +" and the smallest is "+smallest+"\nThe avreage is "+avg);
    }

    public static void arrayAvg(int[] array)
    {
        int avg, sum = 0, size = array.length - 1;
        for(int i = 0 ; i < array.length ; i++)
        {
            sum += array[i];
        }
        avg = sum / size;
        System.out.println("The avrage of this array is : "+avg);
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

    public static void selectionSortUpdated(int[] array)
    {
        int temp = 0, smallest = 0, index=0;
        for(int i = 0 ; i < array.length ; i++)
        {
            boolean state =  false;
            index = i;
            for(int j = i ; j < array.length -1; j++)
            {
                if(array[index] > array[j+1])
                {
                    smallest = array[j+1];
                    index = j+1;
                    state = true;
                }
            }
            if(state == true)
            {
                temp  = array[i];
                array[i] = array[index];
                array[index] = temp;
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

    public static void fill2dArray(int[][] array)
    {
        Scanner scanner = new Scanner(System.in);
        int input = '\0';
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0 ; j < array[i].length ; j++)
            {
                System.out.println("Enter a value of element ["+i+"]["+j+"]");
                input = scanner.nextInt();
                array[i][j] = input;
            }
        }
    }

    public static boolean checkMatrix(int[][] array)
    {
        boolean isMatrix = true;
        for (int i = 0 ; i < array.length ; i++)
        {
            int rows = array.length, cols = 0;
            for (int j = 0 ; j < array[i].length ; j++)
            {
                cols++;
            }
            if(rows != cols)
            {
                isMatrix = false;
                break;
            }
        }
        return isMatrix;
    }

    public static void print2dArray(int[][] array)
    {
        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 0 ; j < array[i].length ; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ops2dArray(int[][] array)
    {
        int tot_sum = 0 ;
        for(int i = 0 ; i < array.length ; i++)
        {   int index = i + 1;
            int row_sum = 0 , col_sum = 0;
            for (int j = 0 ; j < array[i].length ; j++)
            {
                tot_sum += array[i][j];
                row_sum += array[i][j];
                col_sum += array[j][i];
            }
            System.out.println("sum of row "+ index +" is "+row_sum);
            System.out.println("sum of col "+ index +" is "+col_sum);
            System.out.println();
        }
        System.out.println("sum of the whole array is "+tot_sum);
    }

    public static void invertMatrix(int[][] array)
    {
      int rows = array.length, cols = array[0].length;
      int[][] array2 = new int[rows][cols];
      for (int i = 0 ; i < rows ; i++)
      {
          for (int j = 0 ; j < cols ; j++)
          {
              array2[j][i] = array[i][j];
          }
      }
      print2dArray(array2);
    }

    public static void leftDiagone(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int j = 0 ; j < array[i].length ; j++)
            {
                if(i == j)
                    System.out.print(array[i][j]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void rightDiagonale(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0 ; j < array[i].length ; j++)
            {
                if(j == array.length - 1 - i)
                    System.out.print(array[i][j]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void bothDiagonals(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int k = 0 ; k < array[i].length ; k++)
            {
                if(i == k)
                    System.out.print(array[i][k]+" ");
                else if(k == array.length - 1 - i)
                    System.out.print(array[i][k]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void diagonalSum(int[][] array)
    {
        int leftSum = 0 , rightSum = 0 , fullSum = 0;
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0 ; j < array[i].length ; j++)
            {
                if(i == j)
                {
                    leftSum += array[i][j];
                    fullSum += array[i][j];
                }

                if(j == array.length - 1 -i)
                {
                    rightSum += array[i][j];
                    fullSum  += array[i][j];
                }
            }
        }
        System.out.println("Both diagonal sum is "+fullSum);
        System.out.println("left diagonal sum is "+leftSum);
        System.out.println("right diagonal sum is "+rightSum);
    }

    public static void rowMultipilcation(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            int sum = 1, index = i + 1;
            for (int j  = 0 ; j < array[i].length ; j++)
            {
                sum *= array[i][j];
            }
            System.out.println("The sum of row "+index+" is "+sum);
        }
    }

    public static void colsMultiplication(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            int sum = 1 , index = i + 1;
            for (int j = 0 ; j < array[i].length ; j++)
            {
                sum *= array[j][i];
            }
            System.out.println("The sum of column "+index+" is "+sum);
        }
    }

    public static void upperHalf(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for(int k = 0 ; k < array.length ; k++)
            {
                if(k >= i)
                    System.out.print(array[i][k]+" ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void sumOf2Arrays(int[][] array1, int[][] array2)
    {
        if(array1.length != array2.length)
            System.out.println("Rows arent equals");
        else if(array1[0].length != array2[0].length)
            System.out.println("Columns arent equals");
        else
        {
            int rows = array1.length, columns = array1[0].length;
            int[][] array3 = new int[rows][columns];

            for (int i = 0 ; i < rows ; i++)
            {
                for (int j = 0 ; j < columns ; j++)
                {
                    array3[i][j] = array1[i][j] + array2[i][j];
                }
            }
            print2dArray(array3);
        }
    }

    public static void midRow(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0 ; j < array.length ; j++)
            {
                if(j + i == i + 1)
                    System.out.print(array[j][i]+" ");
            }
        }
    }

    public static void midCol(int[][] array)
    {
        for(int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0 ; j < array.length ; j++)
            {
                if(i + j == i + 1)
                    System.out.print(array[i][j]+" ");
            }
        }
    }
    
    public static void middleRowCol(int[][] array, int rows)
    {
        if(rows % 2 != 0)
        {
            int midRow = rows / 2;
            for (int i = 0 ; i < array.length ;i++)
            {
                System.out.print(array[midRow][i]+" ");
            }
            System.out.println();
            for (int i = 0 ; i < array.length ; i++)
            {
                System.out.print(array[i][midRow]+" ");
            }
            System.out.println();
        }
    }

    public static void printArrayList(ArrayList<String> arrayList)
    {
        for (String str : arrayList)
        {
            System.out.println(str);

        }
    }

}
