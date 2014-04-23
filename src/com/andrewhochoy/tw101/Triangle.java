package com.andrewhochoy.tw101;

/**
 * Created by ahochoy on 4/23/14.
 */
public class Triangle {

    public static void printCharacterToConsole(char ch)
    {
        System.out.print(ch);
    }

    public static void printHorizontalLineToConsole(char ch, int width)
    {
        for (int i = 0; i < width; i++ )
        {
            printCharacterToConsole(ch);
        }
    }

    public static void printVerticalLineToConsole(char ch, int height)
    {
        for (int i = 1; i <= height; i++ )
        {
            printHorizontalLineToConsole(ch, 1);
            System.out.print("\n");
        }
    }

    public static void printRightTriangleToConsole(char ch, int height)
    {
        for (int i = 1; i <= height; i++ )
        {
            printHorizontalLineToConsole(ch, i);
            System.out.print("\n");
        }
    }

    public static void printIsoscelesTriangleToConsole(char ch, int height, int offset)
    {
        int maxWidth = ((height + offset) * 2) - 1;

        for( int i = 1; i <= height; i++ )
        {
            int width = (i * 2) - 1;
            printCenteredHorizontalLineToConsole(ch, width, maxWidth);
            System.out.print("\n");
        }
    }

    public static void printReverseIsoscelesTriangleToConsole(char ch, int height, int offset)
    {
        int maxWidth = ((height + offset) * 2) - 1;

        for( int i = height; i > 0; i-- )
        {
            int width = (i * 2) - 1;
            printCenteredHorizontalLineToConsole(ch, width, maxWidth);
            System.out.print("\n");
        }
    }

    private static void printCenteredHorizontalLineToConsole(char ch, int amount, int maxWidth)
    {
        int spaceWidth = (maxWidth - amount)/2;

        printHorizontalLineToConsole(' ', spaceWidth);
        printHorizontalLineToConsole(ch, amount);
    }
}
