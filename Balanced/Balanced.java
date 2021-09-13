/*James Ryan A. Mocorro   
March 9 2021
CCB4
**/
import java.io.*;

public class Balanced {

    static Stack stack = new Stack();

  
    static String left = "(, [, {";   
    static String right = "), ], }";
    
    public static void main(String[] args) {
        
        String input_file = args[0];
       
        String str;
        
        try {
             FileReader input = new FileReader(input_file);
             BufferedReader br = new BufferedReader(input);


            
            for (str = br.readLine();  str != null; str = br.readLine()) {

                if (isNumber(str) == true) {
                    System.out.println("This file has " + Integer.valueOf(str) + " " + "lines");
                    continue;
                }
               
                toCompare(str);
                if (stack.isEmpty()) {
                    System.out.println("The line is balanced");
                } else {
                    System.out.println("The line is unbalanced");
                }  
            } 
            br.close();
        } catch(Exception e) {
            System.out.println("There was an exception " + e.getMessage());
        }
    }

  
    public static void toCompare(String read) {
        for (int i = 0; i < read.length(); i++) {

            if (left.indexOf(read.charAt(i)) != -1) {
                stack.push(read.charAt(i));
            }
            else if (right.indexOf(read.charAt(i)) != -1) {
                stack.comPair(read.charAt(i));
            }

            
            else {
                continue;
            }
        }            
    }
    
   
    public static boolean isNumber (String str) {
        
        try {
            
            int num = Integer.parseInt(str);
            return true;

        } catch(NumberFormatException error) {
        }
        return false;
    }
}