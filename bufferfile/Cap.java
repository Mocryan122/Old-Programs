/**James Ryan A. Mocorro
 * CCB4
 * March 23, 2021
 */
import java.io.*;
class Cap {

  static link in = new link();
  public static void main(String args[]) {

    String input_file = args[0];
    String output_file = args[1];
    
      try {

        FileReader file_reader = new FileReader(input_file);
        BufferedReader br = new BufferedReader(file_reader);

        FileWriter file_writer = new FileWriter(output_file);
        BufferedWriter bw = new BufferedWriter(file_writer);

        String str =" ";
       
        while( (str = br.readLine()) != null ) {

          in.sulat(str,output_file);
        }
          
        br.close();
        bw.close();

      } catch(Exception e) {

          System.out.println("An exception occured!");
      }

  }
}

