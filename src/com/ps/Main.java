package com.ps;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //Conditions.isPrimePrint(10);
       // Loops.magicNumber(1252);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = {1 , 5 , 6 , 12 , 4 , 9};
        int[][] values = {{1,2,5},{3,4,9},{3,4,4}};
        int[][] values2 = {{5,6},{0,7}};
        int[][] array = {{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3}};

        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Ford GM");
        Cars.add("Bmw");
        Cars.add("Mercedes");

        Arrays.addElementToArrayList(Cars);

        Arrays.printArrayList(Cars);

    }
}
