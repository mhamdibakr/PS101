package com.ps;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] sArray = {3,5,-4,8,11,1,-1,6};
        int[] sArray2 = {-5, -4, -3, -2, -1};

        int[] array = ArraysTwo.twoNUmberSum2(sArray,10);
        Arrays.printIntArray(array);


    }
}

