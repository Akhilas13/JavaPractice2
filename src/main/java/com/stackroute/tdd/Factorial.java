//Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer).
//Modify your program and add a method called longFactorial to list all the factorial that can be expressed as a long (64-bit signed integer)
// The maximum value for long is kept in a constant called Long.MAX_VALUE.

package com.stackroute.tdd;

class Factorials {
    // Factorial expressed as a 32-bit signed integer
    public void integerFactorial() {
        int factorial = 1;
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {

            // if number greater or equals to 13 it's factorial is out of range
            if (i == 13) {
                System.out.println("The factorial of" + i);
                System.out.println("out of range");
                break;
            }
            factorial = factorial * i;// finding factorials for number less than 13
            System.out.println("The factorial of" + i);
            System.out.println(factorial);
        }

    }

    // factorial expressed as a 64-bit signed integer
    public void longFactorial() {

        long factorial = 1;
        for (int i = 1; i <= Long.MAX_VALUE; i++) {
            if (i == 21) {
                System.out.println("The factorial of" + i);
                System.out.println("out of range");
                break;
            }
            factorial = factorial * i;
            System.out.println("The factorial of" + i);
            System.out.println(factorial);
        }

    }


}

public class Factorial {
    public static void main(String[] args) {
        Factorials factorials = new Factorials();
        factorials.integerFactorial();
        factorials.longFactorial();
    }
}
