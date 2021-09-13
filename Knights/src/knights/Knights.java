
package knights;
 import java.util.Scanner;

public class Knights {

   public static void main(String[] args) {
    Board b = new Board();
    Scanner in = new Scanner(System.in);
    
    
    System.out.println("Knigth's Tour");
    System.out.println("please pick a integer for column and row for a posibble move for the Knight");
      
       System.out.print("Row: ");
 
       int r = in.nextInt();
     
       System.out.print("Column: ");
     
       int c = in.nextInt();
     
       
       System.out.println("possible moves for ROW: " + r + " COlUMN:"+ c );
       if (r  < 9 && c < 9 ){
             
       b.moves(r, c);
       }
       if(c > 8 || r > 8){
            
           System.out.println("Out of bounds");
            
            
            
        }        
      
      
     }
    
}