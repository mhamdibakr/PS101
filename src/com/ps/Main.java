package com.ps;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {1, 55, 41, 77, 23, 15, 33};
        int[][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};



        Arrays.print2dArray(array2);
        Arrays.colsMultiplication(array2);
        Conditions.leapYear(2020);
        System.out.println("box and pit confirm max please");

    }
}

