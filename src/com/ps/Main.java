package com.ps;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] sArray = {1,2,3,4};
        int[] sArray2 = {1,2,4};

        List<Integer> array = List.of(1, 2, 3, 4);
        List<Integer> sub = List.of(1, 4, 4);

        System.out.println(ArraysTwo.isValidSubsequenceV2(array,sub));


    }
}

