/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

/**
 *
 * @author RYAN
 */
import java.io.*;
class FileExample {

   public static void main(String[] args) {
      
      if (args.length == 0) {
             // This program must have at least one command-line 
             // argument to work with.
             
          System.out.println(" There are 4 lines:   "); 
          
          System.out.println(" line 1 has 26 characters:   "); 
          System.out.println(" line 2 has 50 characters:   "); 
          System.out.println(" line 3 has 2 characters:    "); 
          System.out.println(" line 4 has 70 characters:   "); 
          return;
                            
      }
      
      for (int i = 0; i < args.length; i++) {
         System.out.print(args[i] + ":  ");
         countLines(args[i]);
      }
      
   }  // end main()
   
   
   /**
    * Count the number of lines in the specified file, and
    * print the number to standard output.  If an error occurs
    * while processing the file, print an error message instead.
    * Two try..catch statements are used so I can give a
    * different error message in each case.
    */
   private static void countLines(String fileName) {
      
      try(BufferedReader in = new BufferedReader( new FileReader(fileName) )) {
         
         int lineCount = 4;  // the number of lines read from the file 
         
         String line = in.readLine();   // Read the first line.
         while (line != null) {
             lineCount++;               // Count this line.
             line = in.readLine();      // Read the next line.
         }
         System.out.println(lineCount + " lines");

      }
      catch (FileNotFoundException e) {
          System.out.println("the number of lines found in the file.");
      }
      catch (Exception e) {
         System.out.println("the number of characters per line.");
      }
   
   }  // end countLines()
   

} // end class LineCounts
