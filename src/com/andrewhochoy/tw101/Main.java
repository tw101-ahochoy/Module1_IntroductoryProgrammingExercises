package com.andrewhochoy.tw101;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println("Asterisk");
        Triangle.printCharacterToConsole('*');
        System.out.println("H Line of 3");
        Triangle.printHorizontalLineToConsole('*', 3);
        System.out.println("V Line of 5");
        Triangle.printVerticalLineToConsole('*', 5);
        System.out.println("R Triangle of 4");
        Triangle.printRightTriangleToConsole('*', 4);
        System.out.println("I Triangle of 7");
        Triangle.printIsoscelesTriangleToConsole('*', 7, 0);
        System.out.println("Diamond of 5");
        Diamond.printDiamondToConsole('*', 5);
        System.out.println("Diamond of 3 with Name");
        Diamond.printDiamondWithNameToConsole('*', 3, "Andrew");
       
        FizzBuzz.printNumbersTo(100);
        */

        for (Integer integer : PrimeFactors.generate(30)) {
            System.out.println(integer);
        }
    }
}