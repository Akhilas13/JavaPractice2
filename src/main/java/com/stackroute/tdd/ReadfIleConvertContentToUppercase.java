//program to read the content of a text file, convert the content in upper case
//and print the same in console along with the length of the file
package com.stackroute.tdd;

import java.io.File;
import java.util.Scanner;

public class ReadfIleConvertContentToUppercase {

    public static void main(String[] args) throws Exception {
        // Give the filepath
        File file = new File("/home/akhila/Downloads/error");
        Scanner input = new Scanner(file);
        // read each line from file and convert to uppercase
        while (input.hasNextLine()) {
            System.out.println(input.nextLine().toUpperCase());
        }

    }
}
