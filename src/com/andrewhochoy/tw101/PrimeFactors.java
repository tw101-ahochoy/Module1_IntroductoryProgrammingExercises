package com.andrewhochoy.tw101;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahochoy on 4/23/14.
 */
public class PrimeFactors
{
    public static List<Integer> generate(int n)
    {
        List<Integer> factors = new ArrayList<Integer>();

        for (int p : primesTo(n))
            if (areFactors(n, p)) factors.add(p);

        return factors;
    }

    private static boolean areFactors(int number, int factor)
    {
        return (number % factor) == 0;
    }

    private static List<Integer> primesTo(int n)
    {
        boolean[] isPrimeNumber = new boolean[n + 1];

        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < n; i++)
        {
            isPrimeNumber[i] = true;
        }

        for (int i = 2; i < n; i++)
        {
            if (isPrimeNumber[i])
            {
                primes.add(i);

                for (int j = i; j * i <= n; j++)
                {
                    isPrimeNumber[i * j] = false;
                }
            }
        }
        return primes;
    }
}