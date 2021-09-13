
package logic;

import java.util.Scanner;
public class Logic {

   
    public static void main(String[] args) {
           Scanner u = new Scanner(System.in);
           int a = 15;
           int [][][]  num = new int[15][15][15];
           System.out.println("Please enter 15 integers");
           for (int b = 0; b <=a -1 ; b++){
               num[0][0][b] =u.nextInt();
           }
           System.out.println("the integers you pick");
            for (int b = 0; b <=a -1 ; b++){
               System.out.print(num[0][0][b] +" ");
           }

    }
    
}
