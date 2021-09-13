
package polymorphism;
import java.util.Scanner;
public class Polymorphism {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        sum sumnumber = new sum();
        int a; int b; int c; int d; int e;
        int f; int g; int h; int i; int j;
        System.out.println("enter ten integers");
        a = u.nextInt();
        b = u.nextInt();
        c = u.nextInt();
        d = u.nextInt();
        e = u.nextInt();
        f = u.nextInt();
        g = u.nextInt();
        h = u.nextInt();
        i = u.nextInt();
        j = u.nextInt();
         System.out.println("total sum = " + sumnumber.add(a,b,c,d,e,f,g,h,i,j));
        
        
        
    }
    
}
