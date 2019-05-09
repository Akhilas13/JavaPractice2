//program, which reads number of students and n grades as input (of int
//between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//program shall check for valid input. You should keep all the grades in an int[] and use a
//method for each of the computations.
package com.stackroute.tdd;

import java.util.Scanner;

class Grade {
    public void calculate(int number, int[] grades) {
        int min = 100;//set minimum value to 100
        int max = 0;// set maximum value to 0
        int sum = 0;//set sum as 0
        for (int j = 0; j < number; j++) {
            int num = grades[j];

            //if number from an array index is greater than maximum value assign that number as maximum value
            if (num > max) {
                max = num;
            }

            // if number from an array index is less than minimum value assign that number as minimum value
            if (num < min) {
                min = num;
            }

            //sum the numbers
            sum = sum + num;
        }

        //finding the average
        double avg = sum / number;

        //print the average, maximum,and minimum value
        System.out.println("The average is" + avg);
        System.out.println("The maximum is" + max);
        System.out.println("The minimum is" + min);
    }

}

public class Grades {
    public static void main(String[] args) {
        Grade g = new Grade();
        System.out.println("enter the number of students:");
        Scanner input = new Scanner(System.in);
        int[] grades = new int[20];
        System.out.println("enter the grades:");
        int inputs = input.nextInt();
        for (int i = 0; i < inputs; i++) {
            grades[i] = input.nextInt();//read the grades to an array
        }

        g.calculate(inputs, grades);


    }
}


