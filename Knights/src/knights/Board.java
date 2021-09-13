
package knights;


public class Board {
 
    int [][] board;
    
    public Board(){
     this.board = new int[9][9];
         for (int y = 1; y < 9 ; y++){
       
             for(int yy = 1; yy < 9 ; yy++){
             this.board[y][yy] = 0;
             }
          }
      }
    
    public void board(){
        for(int y = 1; y < 9  ; y++){
            
            for(int yy = 1; yy < 9   ; yy++){
                   
                 System.out.print(this.board[y][yy] + "  " );
            }
            System.out.println();
        }
      
    }
   
    public void set_knight(int row, int col, int value){
     
        this.board[row][col] = value;
    }
    
   
    public void moves(int r, int c){
      
       int xx;
       int yy;
       Board a = new Board();
       a.set_knight(r,c, 1);
       
       
       int x []  = new int [9] ;
       x[1]= 2; 
       x[2]= 1; 
       x[3]=-1; 
       x[4]=-2; 
       x[5]=-2; 
       x[6]=-1; 
       x[7]= 1; 
       x[8]= 2;  
       int y []  = new int [9] ;   
       y[1]= 1;
       y[2]= 2; 
       y[3]= 2; 
       y[4]= 1; 
       y[5]=-1; 
       y[6]=-2; 
       y[7]=-2; 
       y[8]=-1;
       
      
         for(int i = 1; i<9; i++){
             
             xx = c + x[i];
             yy = r + y[i];
                
         
        if (xx >= 1 && xx < 9 && yy >= 1 && yy < 9 ){
            
            a.set_knight(yy,xx,2);
            
        }
         
  }
       a.board();
     
    }
    }


