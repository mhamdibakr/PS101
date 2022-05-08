package com.ps;

public class Conditions
{
    public static void oddOrEven(int number)
    {
        if(number % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

    public static void absoluteValue(int number)
    {
        if(number < 0)
            System.out.println("the abolute value of "+number+" is "+number * -1);
        else
            System.out.println(number+" is already positive");
    }

    public static void discountCalculator(int price , int quantity)
    {
        int rev = price * quantity;
        if(rev >= 5000)
        {
            int dicount = rev * 10 / 100 ;
            rev = rev - dicount;
            System.out.println("you can take a 10% discount on your bill, "+rev);
        }
        else
            System.out.println("Unfortunatley you dont take a discount");
    }

    public static void largestNumberIn3(int n1 , int n2 , int n3)
    {
        int lagest = 0;
        if(n1 > n2 && n1 > n3)
            lagest = n1;
        else if(n2 > n1 && n2 > n3)
            lagest = n2;
        else
            lagest = n3;

        System.out.println(lagest+" is the largest");
    }

    public static void PNZ(int number)
    {
        String des = "\0";
        System.out.println(des);
        if(number > 0)
            des = "Number is positive";
        else if (number < 0)
            des = "Number is negative";
        else
            des = "Number is a zero";

        System.out.println(des);
    }

    public static void validTriangle(int a1, int a2, int a3)
    {
        int triangleSum = a1 + a2 + a3 ;
        if(triangleSum == 180)
            System.out.println("Valid Trinagle");
        else
            System.out.println("Not a Valid Trinagle");
    }

    public static void leapYear(int year)
    {
        String res = "\0";
        if(year % 4 == 0)
            res = "Leap year";
        else if(year % 100 == 0 && year % 400 == 0)
            res = "Leap year";
        else
            res = "Not a leap year";

        System.out.println(res);
    }
}
