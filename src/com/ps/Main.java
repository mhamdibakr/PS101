package com.ps;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //Conditions.isPrimePrint(10);
       // Loops.magicNumber(1252);
        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        int[] numArrays = {1 , 5 , 6 , 12 , 7 , 9 , 4};
        int[][] values = {{1,2,5},{3,4,9},{3,4,4}};
        int[][] values2 = {{5,6},{0,7}};
        int[][] array = {{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3},{1,2,3,5,3}};

        Arrays.selectionSort(numArrays);
        Loops.coronaNumber(555);

    }
}
