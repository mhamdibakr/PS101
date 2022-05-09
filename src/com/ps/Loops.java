package com.ps;

import java.util.Scanner;

public class Loops
{
    public static void from1to10()
    {
        for (int i = 1 ; i <= 10 ; i++)
        {
            System.out.println(i);
        }
    }

    public static void sumofF10()
    {
        int sum = 0 ;
        for (int i = 0 ; i <= 10 ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable(int number)
    {
        for (int i = 0 ; i <= 10 ; i++)
        {
            System.out.println(number+" * "+i+" = "+number * i);
        }
    }

    public static void factoriel(int number)
    {
        int res  = 1;
        for(int i = 1 ;  i <= number ; i++)
        {
            res *= i;
        }
        System.out.println("factoriel of "+number+"! is "+res);

    }

    public static int factorielRecurion(int number)
    {
        if(number == 1)
            return 1;
        else
            return number * factorielRecurion(number - 1);
    }

    public static void nPower(int number, int power)
    {
        int res = 1;
        for(int i = 1 ; i <= power ; i++)
        {
            res *= number;
        }
        System.out.println(number+" powers "+power+" is "+res);
    }

    public static void reversedNumber(int number)
    {
        int n = number ,  rest = 0 , mod = 0;
        while(n > 0)
        {
            mod = n % 10;
            n /= 10 ;
            rest = rest * 10 + mod ;
        }
        System.out.println(rest);
    }

    public static void oddEvenSum()
    {
        Scanner scanner = new Scanner(System.in);
        int oddSum = 0 ,  evenSum = 0, input;
        char choice = '\0';

        do
        {
            System.out.println("Enter a new nuumber :");
            input = scanner.nextInt();

            if(input % 2 == 0)
                evenSum += input;
            else
                oddSum += input;

            System.out.println("Press c to continue or any other key to leave");
            choice = scanner.next().charAt(0);
        }while (choice == 'c' || choice == 'C');

        System.out.println("Even sum is : "+evenSum);
        System.out.println("Odd sum is  : "+oddSum);
    }

    public static void primeNumber(int number)
    {
        boolean flag = true;

        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }

    public static void HCFbyPrimeFactorization(int n1, int n2)
    {
        int hcf = 0;
        for(int i = 1; i <= n1 || i <= n2; i++) {
            if( n1%i == 0 && n2%i == 0 )
                hcf = i;
        }
        System.out.println(hcf);
    }

    public static void HCFbyDivision(int n1, int n2)
    {
        int hcf = 0, remainder = 0, dividend = n1, divisor = n2;

        do
        {
            remainder = dividend % divisor;
            if(remainder == 0)
                hcf = divisor;
            else
            {
                dividend = divisor;
                divisor  = remainder;
            }

        }while (remainder != 0);
        System.out.println(hcf);
    }

}
