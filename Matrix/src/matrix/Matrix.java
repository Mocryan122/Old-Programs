
package matrix;
//CC12
      //January 25, 2021
         // James Ryan A. Mocorro
            // I only use only for loop for the triangle and use the Knight's tour code and then combine them.
             

public class Matrix {
    public static void main(String[] args) {
     xx a = new xx();
      for(int x = 0; x <=4; x++){
            for(int i = 0; i<=x; i++){
                a.set_knight(x,i,-1);
                
            }
                System.out.println();
      }

        for(int x = 0; x <=4; x++){
            for(int i = 0; i<=x; i++){
                a.set_knight(i,x,1);
                
            }
                System.out.println();
                
      }
         for(int i = 0; i<=4; i++){
                a.set_knight(i,i,0);
        
    }
    a.xx();  
}
    
}
