/* CC12
   Mocorro, James Ryan A.
    Exercise 1.
 */

package minmax;




public class Minmax {

public static int getMin(int []a){
    
     int min = 0;
     
     for(int x = 1; x < a.length; x++){
          
         int val = a[x];
         
          if(min==0 || val < min){
             
             min = val  ;
           
       }
         
     }
    
   return min ;  
 }


    
    
    
     public static int getMax(int []a){
    
     int max = 0;
     
     for(int x = 1; x < a.length; x++){
          
         int val = a[x];
         
          if(max==0 || val > max){
             
             max = val  ;
           
       }
         
     }
    
   return max ;  
 }
    
  
     
     
     
    
    public static void main(String[] args) {
     int [] array = {12,23,3,44,57,90,86,32,56};
 
     
    System.out.println("Minimum element of the array: " + getMin(array)); 
    System.out.println("Maximum element of the array: " + getMax(array)); 
  }
  
  
 
    
}
