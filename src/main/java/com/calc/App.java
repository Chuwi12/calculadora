package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculadora calc = new Calculadora(4, 5);

        System.out.println(calc.suma());
    }
}
