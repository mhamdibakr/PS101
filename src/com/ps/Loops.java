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

    public static void promptNumbersSum()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0 , input;
        char choice = '\0';

        do
        {
            System.out.println("Enter a number ");
            input = scanner.nextInt();
            sum += input;
            System.out.println("Press c to continue or any other key to leave");
            choice = scanner.next().charAt(0);

        }while (choice == 'c' || choice == 'C');

        System.out.println(sum);
    }

    public static void numberCount()
    {
        Scanner scanner = new Scanner(System.in);
        int input, posCount = 0, negCount = 0, zCount = 0;
        char choice = '\0';

        do
        {
            System.out.println("Enter a number" );
            input = scanner.nextInt();

            if(input > 0)
                posCount++;
            else if(input < 0)
                negCount++;
            else
                zCount++;

            System.out.println("Press c to continue or any other key to leave");
            choice = scanner.next().charAt(0);

        }while (choice == 'c' || choice == 'C');

        System.out.println("Positive numbers count : "+posCount);
        System.out.println("Negative numbers count : "+negCount);
        System.out.println("Zer00000 000000s count : "+zCount);
    }

    public static void largestANDsmallest()
    {
        Integer largest = Integer.MIN_VALUE , smallest = Integer.MAX_VALUE, sum = 0,  input;
        Character choice = '\0';
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Enter a number ");
            input = scanner.nextInt();

            if (input > largest)
                largest = input;
            if(input < smallest)
                smallest = input;

            sum += input;

            System.out.println("Press c to continue or any other key to leave");
            choice = scanner.next().charAt(0);

        }while (choice == 'c' || choice == 'C');

        System.out.println("Largest  number is : "+largest);
        System.out.println("Smallest number is : "+smallest);
        System.out.println("The sum of numbers is : "+sum);
    }

    public static void checkArmstrongNumber(int n)
    {
        int number = n, reminder = 0;
        int sum = 0;
        do
        {
            reminder  = number % 10;
            sum += powerSquared(reminder);
            number /= 10;
        }while (number > 0);

        if(sum == n)
            System.out.println(sum);
    }

    public static void armstrongNumber()
    {
        for (int i = 1 ; i <= 50 ; i++)
        {
            checkArmstrongNumber(i);
        }
    }

    public static int powerSquared(int number)
    {
        int res = 1;
        for (int i = 0 ; i < 3 ; i++)
        {
            res *= number;
        }
        return res;
    }

    public static void fibonacci(int number)
    {
        int f_term = 0 , s_term = 1 , th_term ;

        for(int i = 0;  i <= number ; i++)
        {
            th_term = f_term + s_term;
            f_term = s_term;
            s_term = th_term;
            System.out.print(th_term+" ");
        }
    }

    public static int fibonacciRecursion(int number)
    {
        if (number <= 1)
            return number;

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    public static void iIteration(int n)
    {
        double res = 1;
        for(int i = 2 ; i <= n ; i++)
        {
            res += (double) 1 / i ;
            String formattedString = String.format("%.04f", res);
            System.out.print(formattedString+" ");
        }
    }

    public static void LogarithmofN(int number)
    {
        double sum = 0 ;
        int sign = 1;
        for(int i = 1 ; i <= number ; i++)
        {
            sum += sign / (double) i;
            sign *= -1 ;
            String stringSum = String.format("%.05f",sum);
            System.out.print(stringSum+" ");
        }
        System.out.println("\nLog of "+number+" is "+sum);
    }

    public static void pickNumber()
    {
        int input = 0, tries = 0 , number ;
        Scanner scanner = new Scanner(System.in);
        number =  (int)(Math.random()*(20-1+1)+1);
        while (input != number)
        {
            tries++;
            System.out.println("Enter a number from 1 to 20");
            input = scanner.nextInt();

            if(input > number)
                System.out.println("Too high");
            else if(input < number)
                System.out.println("Too low");
            else
                System.out.println("Got it right mate");
        }
        System.out.println("You find the number in "+tries+" tries");
    }

    public static void drawAshape(int rows, int cols)
    {
            for (int i = 0 ; i < rows ; i++)
            {
                for (int l = 0 ; l < cols ; l++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    public static void leftTriangle(int rows)
    {
        for (int i = 0 ; i < rows ; i++)
        {
            for( int j = 0 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n)
    {
        int k = 0;
        for (int i = 1; i <= n; ++i)
        {
            k = 0;
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("- ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
    public static void pyramidInNumbers(int n)
    {
        int k = 0;
        for (int i = 1; i <= n; ++i)
        {
            k = 0;
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(i+" ");
                ++k;
            }

            System.out.println();
        }
    }

    public static void pyramidInNumbers1(int n)
    {
        int k = 0, count = 0, count1 = 0;
        for (int i = 1; i <= n; ++i)
        {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= n - 1)
                {
                    System.out.print((i + k) + " ");
                    ++count;
                }
                else
                {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }

    public static void floydTriangle(int n)
    {
        int number = 1;
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                ++number;
            }

            System.out.println();
        }
    }

    public static void fizzBuzz()
    {
        String string;
        for (int i = 0 ; i < 100 ; i++)
        {
            string = "";
            if(i % 3 == 0)
                string += "fizz";

            if(i % 5 == 0)
                string += "Buzz";

            System.out.println(string);
        }
    }

    //way of the series
    public static void sinX(int n, int x)
    {
        int sign = 1;
        double result = 1;
        for(int i = 1 ; i <= n ; i += 2)
        {
            int fact = 1, power = 1;
            fact = factorielRecurion(i);
            power = nPowerdx(x,i);

            sign *= -1;
            result += sign * power / (double) fact;
        }

    }

    // The correct way
    public static void sinX2(int x) {
        double y;
        y = x*Math.PI/180;
        int n = 10, sign = 1;
        double sine = 0;
        for(int i=0; i<=n; i++)
        {
            int fac = 1;
            for(int j=2; j<=2*i+1; j++)
            {
                fac *= j;
            }

            sine += sign* Math.pow(y,2*i+1) / fac;
            sign *= -1;
        }
        System.out.format("The sine of " + x + " is %f",sine);
    }

    public static void cosX(int x, int n)
    {
        int sign = 1, fact, power;
        double result = 0;
        for(int i = 2 ; i <= n ; i+=2)
        {
            fact  = factorielRecurion(i);
            power = nPowerdx(x,i);

            result += (double) sign * power / fact ;
            sign *= -1;
        }
        System.out.println(result);
    }

    // also computing the cos the correct way
    public static void cosX2(int x)
    {
        double y;
        y = x*Math.PI/180;
        int n = 10;
        int i,j,fac;
        double cosine = 0;
        for(i=0; i<=n; i++){
            fac = 1;
            for(j=2; j<=2*i; j++){
                fac*=j;
            }
            cosine+=Math.pow(-1.0,i)*Math.pow(y,2*i)/fac;
        }
        System.out.format("The cosine of " + x + " is %f",cosine);
    }

    public static int nPowerdx(int n, int x)
    {
        int res = 1 ;
        for(int i = 0 ; i < x ; i++)
        {
            res *= n;
        }
        return res ;
    }


}
