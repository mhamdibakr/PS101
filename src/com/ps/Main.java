package com.ps;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException
    {
        int[] array  = {1, 55 , 41 , 77, 23 , 15, 33};
        int[][] array2 = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.print2dArray(array2);
        Arrays.ops2dArray(array2);


        int[][] foo = new int[][] {
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3, 4},
        };


        Arrays.print2dArray(foo);
        System.out.println(foo.length); //2
        System.out.println(foo[0].length); //3
        System.out.println(foo[1].length); //4

    }
}

