package com.ps;

import java.util.*;
import java.util.Arrays;

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


    // time : O(n^2) | space : O(1)
    public static int[] twoNumberSum(int[] array, int n)
    {
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (array[i] + array[j] == n && i != j)
                    {
                       return new int[] { array[i], array[j] };
                    }
                }
            }
       return new int[0];
    }

    // time : O(n) | space : O(n)
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

    // time : O(n log n) | space : O(1)
    public static int[] twoNumberSumV3(int[] array, int n)
    {
        Arrays.sort(array);

        int left  = 0;
        int right = array.length - 1;
        int currentSum = '\0';
        while(left < right)
        {
            currentSum = array[left] + array[right];
            if(currentSum == n)
                return new int[] {array[left], array[right]};
            else if(currentSum < n)
                left++;
            else if(currentSum > n)
                right++;
        }
        return new int[0];
    }


    public static void validateSubsequence(List<Integer> array, List<Integer> subSeq)
    {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer num : array)
        {
            if (subSeq.contains(num))
                res.add(num);
        }

       if(res.equals(subSeq))
           System.out.println("True that mf");
       else
           System.out.println("False");
    }
}
