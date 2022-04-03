package com.ps;

import java.util.Scanner;

public class Loops
{
    public static void from1to10()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.print(i+" ");
        }
    }

    public static void sum1to10()
    {
        int res = 0;
        for(int i = 1 ; i <= 10 ; i++)
        {
            res += i;
        }
        System.out.println("the sum of the 10 first numbers is : "+res);
    }

    public static void multiplicationTable(int num)
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }

    public static void factorial(int num)
    {
        int res = 1;
        for(int i = 1 ; i <= num ; i++)
        {
            res *= i;
        }
        System.out.println("The factorial of "+num+" is "+res);
    }

    public static int factorialRec(int num)
    {
        if(num == 0 || num == 1)
            return 1;
        else
            return num * factorialRec(num -1);
    }

    public static  void powerOf(int n, int p)
    {
        int res = 1;
        for(int i = 1 ; i <= p ; i++)
        {
            res *= n;
        }
        System.out.println(n+" powers "+p+" = "+res);
    }

    public static void invertedNumber(int num)
    {
        int base = num, inv = 0, rev;

        while (base > 0)
        {
            rev = base % 10;
            inv = inv * 10 + rev;
            base /= 10;
        }
        System.out.println(inv);
    }

    public static void eoSum()
    {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0, sumOdd =0;
        char choice = ' ';
        do
        {
            int number ;
            System.out.println("Enter a number : ");
            number = scanner.nextInt();
            if(number % 2 == 0)
                sumEven += number;
            else
                sumOdd += number;

            System.out.println("Enter C to continue or any other key to leave ");
            choice = scanner.next().charAt(0);
        }while (choice == 'c' || choice == 'C');
        System.out.println("Sum of even number is "+sumEven);
        System.out.println("Sum of odd number is "+sumOdd);
    }

    public static void HCF(int num1, int num2)
    {
        int dividend = num1,  divisor  = num2, hcf;

        do
        {
            int res = dividend % divisor;

                hcf = divisor;
                dividend = divisor;
                divisor = res;
        }while (divisor != 0);
        System.out.println("The HCF of "+num1+" and "+num2+" is "+hcf);
    }
    public static void prePost()
    {
        int i = 0 ;
        System.out.println("i init value "+i);
        int a = ++i;
        System.out.println("i value "+i+" value returned by i "+a);

    }

}
