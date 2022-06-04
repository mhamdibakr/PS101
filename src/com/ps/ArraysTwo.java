package com.ps;

import java.util.HashSet;
import java.util.Set;

public class ArraysTwo
{
    /*
        write a function that takes in a non-empty array of distinct intigers
        and a single integer representing a target sum. if any two numbers in the input
        array sum up to the target sum, the function then should return them in an arraym in any order.
        if no two numbers sum up to the target sum, the function should return an empty array.

        note that the target sum has to be obtained by summing two diffrent integes in the array,
        you can't add a single integer to itself in order to obtain the target sum.

        you can assume that there will be at most one pair of numbers summing up the target sum.
    */

    public static void twoNumberSum(int[] array, int n)
    {
        int[] res = new int[2];
        if(array.length <= 1)
            System.out.println("cant perform this op");
        else
        {
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (array[i] + array[j] == n && i != j)
                    {
                        res = new int[]{array[i], array[j]};
                    }
                }
            }
        }
        Arrays.printIntArray(res);
    }

    public static int[] twoNumberSumvV2(int[] array, int n)
    {
        Set<Integer> nums = new HashSet<>();
        for (int num : array)
        {
            int pn = n - num;
            if(nums.contains(pn))
            {
                return new int[] {pn,num};
            }
            else
            {
                nums.add(num);
            }
        }
        return new int[0];
    }


}
