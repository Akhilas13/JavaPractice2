// a Java method to check if a given number is power of 4
package com.stackroute.tdd;

public class PowerOfFour {
    public String powerOfNumber(int number) {

        if (number == 0)
            return ("it is not a power of 4");
        while (number != 1) {
            if (number % 4 != 0) //if it is not divisible by 4 it is not a power of 4
                return ("it is not a power of 4");
            number = number / 4; //else it will be divisible by 4 and hence a power of 4
        }
        return ("it is power of 4");

    }

}
