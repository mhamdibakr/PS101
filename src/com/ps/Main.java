package com.ps;

public class Main {

    public static void main(String[] args)
    {
        //Conditions.isPrimePrint(10);
        //Loops.isPalindrome(512215);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = {1 , 5 , 6 , 12 , 4 , 9};
        int[] array2 = {1,5,2};

        int[][] values = {{1,2,5},{7,4,3},{8,2,4}};

        // Arrays.fill2DArray(values);
        Arrays.print2DArray(values);
        Arrays.sum2DArray(values);
        //Arrays.rightDiagonal(values);
        //Arrays.upperHalf(values);
        Arrays.middleRowCol(values,values.length);
    }
}
