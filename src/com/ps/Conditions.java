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
}
