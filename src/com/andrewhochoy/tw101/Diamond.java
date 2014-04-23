package com.andrewhochoy.tw101;

/**
 * Created by ahochoy on 4/23/14.
 */
public class Diamond {

    public static void printDiamondToConsole(char ch, int width)
    {
        Triangle.printIsoscelesTriangleToConsole(ch, width, 0);
        Triangle.printReverseIsoscelesTriangleToConsole(ch, width - 1, 1);
    }

    public static void printDiamondWithNameToConsole(char ch, int width, String name)
    {
        Triangle.printIsoscelesTriangleToConsole(ch, width - 1, 1);
        System.out.println(name);
        Triangle.printReverseIsoscelesTriangleToConsole(ch, width - 1, 1);
    }
}
