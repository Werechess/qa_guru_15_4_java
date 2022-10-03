package com.example;

public class CalculationExamples {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int e = 25;

        int i = 9;
        double d = 9.0;

        System.out.println("\nПримеры арифметических операторов\n");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c % a = " + (c % a));
        System.out.println("++a   = " + (++a));
        System.out.println("--b   = " + (--b));
        System.out.println("e++   = " + (e++));
        System.out.println("New e = " + e);
        System.out.println("e--   = " + (e--));
        System.out.println("New e = " + e);

        System.out.println("\nПримеры операторов сравнения\n");
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        System.out.println("\nПереполнение при вычислениях\n");
        int someInt = 2147483647;
        System.out.println("2147483647 + 1 = " + ++someInt);
        System.out.println("-2147483648 - 1 = " + --someInt);

        System.out.println("\nКомбинации типов данных (int и double)\n");
        System.out.println("int + double = " + (i + d));
        System.out.println("int - double = " + (i - d));
        System.out.println("int * double = " + (i * d));
        System.out.println("int / double = " + (i / d));
        System.out.println("int % double = " + (i % d));
        System.out.println("int == double = " + (i == d));
    }
}
