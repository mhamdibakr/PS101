package com.ps;

import java.util.*;
import java.util.Arrays;

public class ArraysTwo
{
    /*
        Q1
        write a function that takes in a non-empty array of distinct intigers
        and a single integer representing a target sum. if any two numbers in the input
        array sum up to the target sum, the function then should return them in an arraym in any order.
        if no two numbers sum up to the target sum, the function should return an empty array.

        note that the target sum has to be obtained by summing two diffrent integes in the array,
        you can't add a single integer to itself in order to obtain the target sum.

        you can assume that there will be at most one pair of numbers summing up the target sum.
    */
        public static int[] twoNumberSum(int[] array, int target)
        {
            for(int i = 0; i < array.length ; i++)
            {
                for(int k = i+1; k < array.length ; k++)
                {
                    if(array[i] + array[k] == target)
                        return new int[] {array[i], array[k]};
                }
            }
            return new int[0];
        }

        public static int[] twoNUmberSum2(int[] array, int target)
        {
            Arrays.sort(array);
            int left = 0, right = array.length - 1;

            while (left < right)
            {
                int sum = array[left] + array[right];
                if(sum < target)
                    left++;
                else if(sum > target)
                    right++;
                else if(sum == target)
                    return new int[] {array[left], array[right]};
            }
            return new int[0];
        }



    /*
        Q2
        Given two non-empty arrays of integers, write a function that
        determines whether the second array is a subsequence of the first one.

        A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array
        but that are in the same order as they appear in the array.

        For instance the numbers [1, 3, 4] are a subsequence of the array [1, 2, 3, 4] so do the numbers [2, 4]

        Note that a single number in the array and the array it self are both valid subsequences of the array.
    */



    /*
        Q3
        Write a function  that takes in non-empty array of integers that are sorted in ascending order
        and returns a new array of the same lengh with the squares of the orignal integers also sorted in ascendng order.
    */

// regular commit
}
