package matrix;

public class xx {
 
    int [][] board;
    
    public xx(){
     this.board = new int[5][5];
         for (int y = 0; y < 5 ; y++){
       
             for(int yy = 0; yy < 5 ; yy++){
             this.board[y][yy] = 0;
             }
          }
      }
    
   
    public void xx(){
        for(int y = 0; y < 5  ; y++){
            
            for(int yy = 0; yy < 5   ; yy++){
                   
                 System.out.print(this.board[y][yy] + "  " );
            }
            System.out.println();
        }
      
    }
   public void set_knight(int row, int col, int value){
     
        this.board[row][col] = value;
    
    }
    
        }
   

        
      
    
            
    

  
    


