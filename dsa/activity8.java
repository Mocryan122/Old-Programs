/**
 * Mark Christopher R. Lumbay
 * CC12 - B
 * March 8, 2021
 * This code will check whether brackets of a file is balanced or not
 */

import java.io.*;

public class activity8 {

    static Stack stack = new Stack();

    /**
     * I chose to store the opening and closing brackets in an array
     * to make checking which bracket is which easier
     */
    static String left_Delimeter = "(, [, {";
    static String rightDelimeter = "), ], }";
    
    public static void main(String[] args) {
        
        String input_file = args[0];
        String temp;
        
        try {
            FileReader input = new FileReader(input_file);
            BufferedReader reader = new BufferedReader(input);


            /**
             * This loop will look for the integer which it will use to determine the number of lines
             * It will try parsing it into a number. If it is successful, it will use that as the number of lines
             * Otherwise, this will send the line to another method which will take each character of that line
             * and see if it is opening or closing.
             * After that, it will check if the line is balanced by checking if stack is empty
             */
            for (temp = reader.readLine();  temp != null; temp = reader.readLine()) {

                /**
                 * If a number is mixed with a line that contains brackets, it will not be a problem
                 * since this if statement is expecting an entire line that contains a number only
                 */
                if (isNumber(temp) == true) {
                    System.out.println("This file has " + Integer.valueOf(temp) + " " + "lines");
                    continue;
                }
               
                toCompare(temp);
                if (stack.isEmpty()) {
                    System.out.println("This line is balanced");
                } else {
                    System.out.println("This line is unbalanced");
                }  
            } 
            reader.close();
        } catch(Exception err) {
            System.out.println("There was an exception " + err.getMessage());
        }
    }

    /**
     * This breaks down the line to its individual characters
     * It will compare if the current char is an opening bracket, which it will
     * push into the stack. Otherwise, it will call the ifPair method to check if
     * the closing bracket is a match for the last opening bracket that was pushed into the stack
     * @param read
     */
    public static void toCompare(String read) {
        for (int i = 0; i < read.length(); i++) {

            if (left_Delimeter.indexOf(read.charAt(i)) != -1) {
                stack.push(read.charAt(i));
            }
            else if (rightDelimeter.indexOf(read.charAt(i)) != -1) {
                stack.ifPair(read.charAt(i));
            }

            /**
             * If the character is anything else other than brackets (numbers, letters, symbols) it will disregard and
             * continue with the loop
             */
            else {
                continue;
            }
        }            
    }
    
    /**
     * This is the method that will check if the value of the line is of numerical value
     */
    public static boolean isNumber (String temp) {
        int num;
        try {
            num = Integer.parseInt(temp);
            return true;

        } catch(NumberFormatException error) {
        }
        return false;
    }
}