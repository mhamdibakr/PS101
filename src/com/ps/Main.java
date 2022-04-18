package com.ps;

public class Main {

    public static void main(String[] args)
    {
        //Conditions.isPrimePrint(10);
        //Loops.isPalindrome(512215);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = {1 , 5 , 6 , 12 , 4 , 9};
      //  Arrays.fillArray(numArrays,6);
        Arrays.printArray(numArrays);
        Arrays.sumArray(numArrays);
        Arrays.avgArray(numArrays);
        Arrays.largestAndSmallest(numArrays);
        Arrays.sortArray(numArrays);
        Arrays.searchArray(numArrays,5);

    }
}
