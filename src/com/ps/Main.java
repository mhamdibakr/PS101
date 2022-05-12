package com.ps;

import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException
    {
        int[] array = {15, 8 , 6 , 20 , 85};
        int[] array2 = new int[5];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.cloneArrayInReverse(array,array2);
        Arrays.printIntArray(array2);

    }
}

