/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputfile;

/**
 *
 * @author RYAN
 */
import java.io.*;
public class Inputfile {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String args[]) {

    String input_file = args[0];
    String output_file = args[1];

      try {

        FileReader file_reader = new FileReader(input_file);
        BufferedReader br = new BufferedReader(file_reader);

        FileWriter file_writer = new FileWriter(output_file);
        BufferedWriter bw = new BufferedWriter(file_writer);

        String str = "";
        int ctr = 1;
        while( (str = br.readLine()) != null ) {

          bw.write(ctr++ + ": " + str +"hello \n");
        }

        br.close();
        bw.close();

      } catch(Exception e) {

          System.out.println("An exception occured!");
      }

  }
    
}
