package com.ps;

import java.util.Scanner;

public class Conditions {
    public static void evenOrOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

    }

    public static void absoluteValue(int num)
    {
        int rv = 0;
        rv = num < 0 ? -num : num ;
        System.out.println("the absolute Value of "+num+" is "+rv);

    }

    public static void discountRevenue(double pp, int quantity)
    {
        double rev = pp * quantity ;
        if(rev > 5000)
        {
            System.out.println("You've been offered a 10 % discount on your "+rev+" bill");
            double discount = rev * 0.1;
            rev -= discount;
            System.out.println("Your discount is "+discount);
            System.out.println("The new price to pay is "+rev);
        }
        else
        {
            System.out.println("Unfortunately, you cant take a discount your bill hasn't surpassed 5000");
        }
    }

    public static void largestNumber()
    {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a number");
        a = scanner.nextInt();
        System.out.println("Enter a number");
        b = scanner.nextInt();
        System.out.println("Enter a number");
        c = scanner.nextInt();

        if(a > b && a > c)
            System.out.println(a+" is the largest number");
        else if(b > c)
            System.out.println(b+" is the largest number");
        else
            System.out.println(c+" is the largest number");
    }

    public static void PNZ()
    {
        Scanner scanner = new Scanner(System.in);
        int i ;
        System.out.println("Enter a number");
        i = scanner.nextInt();
        if( i > 0)
            System.out.println("It's a positive number");
        else if(i < 0)
            System.out.println("It's a negative number");
        else
            System.out.println("It's a zero");
    }

    public static void validTriangle(int a1, int a2, int a3)
    {
        int res = a1 + a2 + a3 ;
        if(res == 180)
            System.out.println("It's a valid trinagle");
        else
            System.out.println("It's not a valid trinagle");

    }

    public static void leapYear(int year)
    {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 == 0)
        {
            System.out.println("A leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }

    public static void tBill(int calls)
    {
        int sub = 0;
        double bill;
        if (calls <= 100)
            bill = 200;
        else if(calls > 100 && calls <= 150)
        {
            sub = calls - 100;
            bill = 0.60 * sub + 200 ;
        }
        else if (calls > 150 && calls <= 200)
        {
            sub = calls - 150;
            bill = 0.50 * sub + 0.60 * 50 + 200;
        }
        else
        {
            sub = calls - 200;
            bill = 0.40 * sub + 0.50 * 50 + 0.60 * 50 + 200;
        }
        System.out.println("Your Bill : "+bill);
    }

    public static void averageGrade()
    {
        Scanner scanner = new Scanner(System.in);
        double g1 , g2 , g3, avg ;
        char grade;

        System.out.println("Enter the first grade");
        g1 = scanner.nextDouble();
        System.out.println("Enter the second grade");
        g2 = scanner.nextDouble();
        System.out.println("Enter the thrird grade");
        g3 = scanner.nextDouble();

        avg = (g1 + g2 + g3) / 3;

        if(avg >= 90 )
            grade = 'A';
        else if (avg >= 80 )
            grade = 'B';
        else if (avg >= 70 )
            grade = 'C';
        else if (avg >= 60 )
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Your grade is : "+grade);
    }

    public static void grades()
    {
        Scanner scanner = new Scanner(System.in);
        char choice = '\0';


        System.out.println("enter a grade ");
        choice = scanner.next().charAt(0);
        switch (choice)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
                break;
            default:
                System.out.println("Invalid Input");
        }



    }

    public static void compareNames(String name1, String name2, String name3)
    {
        if (name1.compareTo(name2) > 0
                && name1.compareTo(name3) > 0)
        {
            System.out.println(name1);
            if (name2.compareTo(name3) > 0)
            {
                System.out.println(name2);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name2);
            }
        }

        else if (name2.compareTo(name1) > 0
                && name2.compareTo(name3) > 0)
        {
            System.out.println(name2);
            if (name1.compareTo(name3) > 0)
            {
                System.out.println(name1);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name1);
            }
        }

        else
        {
            System.out.println(name3);
            if (name1.compareTo(name2) > 0)
            {
                System.out.println(name1);
                System.out.println(name2);
            }
            else
            {
                System.out.println(name2);
                System.out.println(name1);
            }
        }
    }

    public static void isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'y')
            System.out.println(c+" is a vowel");
        else
            System.out.println(c+" isn't a vowel");
    }

    public static boolean isPrime(int number)
    {
       // Boolean b = null;
        for(int i = number - 1 ; i > 1 ; i--)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void isPrimePrint(int n)
    {
        for(int i = 2 ; i <= n ; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }



}
