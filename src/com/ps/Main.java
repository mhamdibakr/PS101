package com.ps;

public class Main {

    public static void main(String[] args)
    {
        //Conditions.isPrimePrint(10);
        //Loops.isPalindrome(512215);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = new int[10];
        Arrays.fillArray(numArrays,10);
        Arrays.printArray(numArrays);
        Arrays.sumArray(numArrays);
        Arrays.avgArray(numArrays);
        Arrays.largestAndSmallest(numArrays);
        int[] array2 = numArrays;
        Arrays.printArray(array2);

    }
}
