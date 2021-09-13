/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkqueue;

/**
 * CC12
 * James Ryan A. Mocorro
 * March 16, 2021
 * 
 */
public class Linkqueue {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

      ListQueue t = new ListQueue();    // arg the size of the stack
    
     t.enqueue(5);
     t.enqueue(6);
     t.enqueue(53);
     t.enqueue(1);
     
     
     
    


      t.print();                      
      System.out.println();
      System.out.println(t.dequeue());       
      System.out.println(t.dequeue());       
    
      
      
      t.print();                   

      System.out.println();
       t.enqueue(8);   
       
       t.print();  
       System.out.println();
       t.enqueue(1); 
      
       t.print();   
         
  }
}