package com.example;

public class HelloWorld {

    public static void main(String[] args) {
        char aChar = 'a';                    // 16 бит или 2 байт, Unicode character
        char aChar1 = '1';                   // '\u0000' пример значения по-умолчанию
        String aString = "Hello, World!";    // Класс, не примитив. По-умолчанию равен null

        boolean flag0 = false;
        boolean flag1 = true;

        byte aByte = 0;                      // 8 бит    -(2^7) / (2^7)-1    -128 / 127
        short aShort = 0;                    // 16 бит   -(2^15) / (2^15)-1  -32768 / 32767
        int aInt = 0;                        // 32 бита  -(2^31) / (2^31)-1  -2147483648 / 2147483647
        long aLong = 0L;                     // 64 бита  -(2^63) / (2^63)-1  -9223372036854775808 / 9223372036854775807

        float aFloat = 0.0f;                 // 32 бита  -3.4E+38 / 3.4E+38
        double aDouble = 0.0d;               // 64 бита  -1.7E+308 / 1.7E+308

        System.out.println(aString + " " + flag0 + " " + flag1 + " " + aInt + " " + aDouble);

        // Операторы математические          +  -  *  /  %  ++  --
        // Операторы сравнения/условные      >  <  >=  <=  ==  !=
        // Операторы логические              &&  ||  !  (одинарные тоже можно, но опаснее - они вычисляют значения
        // по обе стороны, а значит в случае null будут вызывать ошибки (напр. null.length())

        // Тернарный оператор                условие ? истина : ложь

        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;
        float f1  = 123.4f;
    }
}
