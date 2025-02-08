package edu.tamu.debugging;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise3 {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a String: ");
            String str = reader.readLine();

            System.out.println("Enter a character to check occurrence: ");
            char ch = reader.readLine().charAt(0);

            System.out.println("Character " + ch + " occurs "
                    + countOccurrences(str, ch) + " times in string \""
                    + str + "\".");

            System.out.println("\n\nEnter another String: ");
            str = reader.readLine();

            System.out.println("The reverse of string \""
                    + str + "\" is " + reverse(str));
        } catch (Exception e){
            System.out.println("Got Exception while executing: " + e.getMessage());
        }
    }

    /**
     * Counts the number of occurrences of char ch in String str.
     *
     * @param s - String to search for ch
     * @param c - char whose occurrence should be counted
     * @return int - the number of occurrences
     *
     * @bugs There are TWO minor errors. Can you find and fix them?
     */
    public static int countOccurrences(String s, char c) {
        int count = 0;
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }
    /**
     * Reverses the String.
     *
     * @param s - String to reverse
     * @return String - the reversed String
     *
     * @bugs There are TWO minor errors. Can you find and fix them?
     */
    public static String reverse(String s) {
        char[] swap = s.toCharArray();
        for (int i = 0; i < swap.length/2; i++) {
            char cTmp = swap[i];
            swap[i] = swap[swap.length-i-1];
            swap[swap.length-i-1] = cTmp;
        }
        return new String(swap);
    }

}
