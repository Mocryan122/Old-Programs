
package square;


public class Square {
 
    public static void main(String[] args) {
        int length = 12;
        int height = 6;
        
        for (int i =0; i<height; i++)
        {
            for(int j= 0; j<length; j++ ){
                if(i==0 || j == 0 || i == height -1 || j == length -1)
                    System.out.print("0");
               else System.out.print(" ");
                
        }
            System.out.println("");
        }
    }
    
}
