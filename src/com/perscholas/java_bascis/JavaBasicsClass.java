package com.perscholas.java_bascis;

public class JavaBasicsClass {
    public static void main(String[] args) {
        // Program 1
        int num1 =5;
        int num2 =10;
        int sum = num1 +num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Program
        double double1 = 1.5;
        double double2 = 2.5;
        double doubleSum = double1 + double2;
        System.out.println("The sum of " + double1 + " and " + double2 + " is " + doubleSum);

        // Program 3
        int intNum = 5;
        double doubleNum = 1.5;
        double mixedSum = intNum + doubleNum;
        System.out.println("The sum of " + intNum + " and " + doubleNum + " is " + mixedSum + " and it is a double.");

        int intNum1 = 10;
        double decimalNum = 2.5;
        double result = decimalNum / intNum1;
        System.out.println("The result of " + decimalNum + " divided by " + intNum1 + " is " + result);
        decimalNum = 10.0;
        result = decimalNum / intNum1;
        System.out.println("The result of " + decimalNum + " divided by " + intNum1 + " is " + result + " and it is a double.");

        // Program 4
        int num3 = 10;
        int num4 = 5;

        if (num4 != 0) {
             result = num3 / num2;
            System.out.println("Result of division of two integers: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }

         decimalNum = 10.0;
        if (num4 != 0) {
            result = decimalNum / num4;
            System.out.println("Result of division of a decimal and an integer: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // Program 5
        double doubleNum1 = 7;
        double doubleNum2 = 12;
        double divResult = doubleNum1 / doubleNum2;
        System.out.println("The result of " + doubleNum1 + " divided by " + doubleNum2 + " is " + divResult);
        int intResult = (int) divResult;
        System.out.println("The integer result is " + intResult);

        // Program 6
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("q = " + q);
        q = (double) y;
        System.out.println("q = " + q);

        // Program 7
        final double PI = 3.14;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        // Program 8 & 9
        double coffeePrice = 2.99;
        double cappuccinoPrice = 3.49;
        double greenTeaPrice = 1.99;
        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int greenTeaQty = 2;
        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (greenTeaPrice * greenTeaQty);
        double salesTax = 0.06; // 6% sales tax
        double totalSale = subtotal * (1 + salesTax);
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Sales Tax: $" + String.format("%.2f", subtotal * salesTax));
        System.out.println("Total Sale: $" + String.format("%.2f", totalSale));








    }
}
