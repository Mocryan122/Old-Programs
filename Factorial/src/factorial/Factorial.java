
package factorial;
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    
    static int number;

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        
        System.out.println("FACTORIAL CALCULATOR");
        System.out.print("Please Enter a positive number: ");
        number = scan.nextInt();
    
        while (number < 0) {
            System.out.println("\nPlease enter a positive number");
            number = scan.nextInt();
        }

        scan.close();
        calc(number);
    }

        static void calc(int x) {
  
        BigInteger output = BigInteger.ONE;

        for (int i = 1; i <= x; i++) {
            output = output.multiply(BigInteger.valueOf(i));
        }

 
        System.out.println("The Factorial of " + number + " is = " + output);
    } 
}