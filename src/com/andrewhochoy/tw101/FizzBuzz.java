package com.andrewhochoy.tw101;

/**
 * Created by ahochoy on 4/23/14.
 */
public class FizzBuzz {


    public static void printNumbersTo(int limit)
    {
        for(int i = 1; i <= limit; i++)
        {
            if( divisibleByThree(i) && divisibleByFive(i))
            {
                System.out.println("FizzBuzz");
            }
            else if ( divisibleByThree(i) && !divisibleByFive(i))
            {
                System.out.println("Fizz");
            }
            else if ( !divisibleByThree(i) && divisibleByFive(i))
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleByThree(int i)
    {
        return (i % 3) == 0;
    }

    private static boolean divisibleByFive(int i)
    {
        return (i % 5) == 0;
    }
}
