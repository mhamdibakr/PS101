package com.ps;

public class Main {

    public static void main(String[] args)
    {
        //Conditions.isPrimePrint(10);
       // Loops.magicNumber(1252);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = {1 , 5 , 6 , 12 , 4 , 9};
        int[][] values = {{1,2,5},{7,4,3},{8,2,4}};

        Arrays.print2DArray(values);
        Arrays.sum2DArray(values);
        Arrays.leftDiag(values);
    }
}
