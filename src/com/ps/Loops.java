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

    public static void HCF2(int num1 , int num2)
    {
        int hcf = 0;
        for(int i = 1; i <= num1 ; i++)
        {
            for (int j =1; j <= i ; j++)
            {
                if(num1 % i == 0 && num2 % j == 0 && i == j)
                {
                    if(i > hcf)
                        hcf = i;
                }
            }
        }
        System.out.println(hcf);
    }

    public static void twoNumbersSum()
    {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sum;
        char choice = ' ';
        do
        {
            System.out.println("Enter the first number ");
            number1 = scanner.nextInt();
            System.out.println("Enter the second number ");
            number2 = scanner.nextInt();
            sum = number1 + number2;

            System.out.println("The sum of "+number1+" and "+number2+" is "+sum);
            System.out.println("Type c if you want to try againg and any key to leave");
            choice = scanner.next().charAt(0);

        }while (choice == 'c' || choice == 'C');
    }

    public static void pnzCount()
    {
        int currentNumber, countPos = 0, countNeg = 0 , countZeros = 0;
        char choice = ' ';
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Enter a number");
            currentNumber = scanner.nextInt();
            if(currentNumber > 0)
                countPos += 1;
            else if (currentNumber < 0)
                countNeg += 1;
            else
                countZeros += 1;

            System.out.println("Type C if you want to continue or any other key if you want to leave");
            choice = scanner.next().charAt(0);

        }while (choice == 'c' || choice == 'C');
        System.out.println("Positive count "+countPos+"\nNegative cout "+countNeg+"\nZeros count "+countZeros);
    }

    public static void smallestLargest()
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        char choice = ' ';
        do
        {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if(number > largestNumber)
                largestNumber = number;

            if(number < smallestNumber)
                smallestNumber = number;

            System.out.println("Type a c if you want to continue or any other key to leave");
            choice = scanner.next().charAt(0);
        }while (choice == 'c' || choice == 'C');

        System.out.println("Largest number is "+largestNumber+" Smallest number is "+smallestNumber);
    }

    public static int cubeN(int number)
    {
        int res = 1;
        for (int i = 1 ; i <= 3 ; i++)
        {
            res *= number;
        }
        return res;
    }
    public static void armstrongNumber(int number)
    {
        int num = number, res = 0, flip;
        do
        {
            flip = num % 10;
            res += cubeN(flip);
            num /= 10;

        }while (num > 0);

        if(res == number)
            System.out.println("it's an armstrong number");
        else
            System.out.println("it's not an armstrong number");
    }

    public static void fibonaci(int number)
    {
        int firstTerm = 0, secondTerm = 1, thirdTerm;
        for(int i = 2; i <= number ; i++)
        {
            thirdTerm = secondTerm + firstTerm;
            System.out.print(thirdTerm+" ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            float res = (float) secondTerm / (float) firstTerm;
        }


    }


    public static void prePost()
    {
        int i = 0 ;
        System.out.println("i init value "+i);
        int a = ++i;
        System.out.println("i value "+i+" value returned by i "+a);

    }

}
