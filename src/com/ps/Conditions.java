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
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            res = "Leap year";
        else
            res = "Not a leap year";

        System.out.println(res);
    }


    /* Write a program to calculate the monthly telephone bills as per the following rule:
       Minimum Rs. 200 for up to 100 calls.
       Plus Rs. 0.60 per call for next 50 calls.
       Plus Rs. 0.50 per call for next 50 calls.
       Plus Rs. 0.40 per call for any call beyond 200 calls.     */

    public static void phoneBill(int calls)
    {
        double amout = 0;
        if(calls <= 100)
            amout = 200;
        else if(calls <= 150)
            amout = 200 + (calls - 100) * 0.60 ;
        else if(calls <= 200)
            amout = 200 + 50 * 0.60 + (calls - 150) * 0.50;
        else if(calls < 200)
            amout = 200 + 50 * 0.60 + 50 * 0.50 + (calls - 200) * 0.40;

        System.out.println("The bill is : "+amout);
    }

    public static void gradeCalculator(int g1 , int g2 , int g3)
    {
        double avg = (g1 + g2 + g3) / 3;
        char grade = '\0';
        if(avg >= 90)
            grade = 'A';
        else if(avg >= 80)
            grade = 'B';
        else if(avg >= 70)
            grade = 'C';
        else if(avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("The grade is : "+grade);
    }

}
