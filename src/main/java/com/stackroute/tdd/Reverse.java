//a Java method to Reverse the given input & Check if it is a Palindrome

package com.stackroute.tdd;

public class Reverse {
    public String stringPalindrome(String word) {
        int length = word.length();
        String word1 = "";
        for (int i = length - 1; i >= 0; i--) {
            word1 = word1 + word.charAt(i);
        }

        if (word == word1)
            return word1;

        else
            return word1;

    }

    public int numberPalindrome(int numbers) {
        int reverse = 0;
        int temporary = numbers;//assign the number to a temporary variable

        //reversing the number
        while (numbers != 0) {
            int remainder = numbers % 10;
            reverse = reverse * 10 + remainder;
            numbers = numbers / 10;
        }
        return reverse;
    }


}

