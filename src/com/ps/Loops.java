package com.ps;

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
}
