package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {1, 55, 41, 77, 23, 15, 33};
        int[][] array2 = {{3, 5, 4}, {7, 6, 9}, {2, 1, 8}};
        int[][] array55 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.arrayOps(array);
        Arrays.middleRowCol(array2,array2.length);
        ArrayList<String> F1 = new ArrayList<>();
        F1.add("McLaren");
        F1.add("Ferari");
        F1.add("Red Bull");
        F1.add("Mercedes");
        F1.add("Alpine");
        F1.add("Aston Martin");
        F1.add("Alpha Tauri");
        F1.add("Alpha romeo");
        F1.add("Williams");
        F1.add("Haas");

        Arrays.printArrayList(F1);
    }
}

