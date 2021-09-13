package linked.list;

import java.util.Scanner;
public class LinkedList {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        link linkin = new link();
    
        linkin.prepend(2);
        linkin.prepend(4);
        linkin.prepend(5);
        linkin.append(69);
        linkin.append(75);
        linkin.append(89);
        
        System.out.println("the value of link list is " + linkin.getsize());
            
        
        System.out.println();
        linkin.printlist();
        
        System.out.println();
        System.out.println("what number do you want to delete");
        System.out.println();
               
        int yo = in.nextInt();
            linkin.delete(yo);
            linkin.printlist();
       System.out.println();
       System.out.println("what number do you want to insert");
        int a = in.nextInt();
         System.out.println(); 
        System.out.println("the number would you like to insert before");
        int b = in.nextInt();
        System.out.println();   
        linkin.insert(a,b);
      System.out.println("the number you added" + b);
       linkin.printlist();
     System.out.println();   
     System.out.println("what number do you want to find?");   
       int c =in.nextInt();
       
       System.out.println("we found number :" + linkin.find(c));
      
       
    
        }
    }