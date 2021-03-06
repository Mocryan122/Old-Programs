import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Connect4 {
    private static final char[] players = new char[] { 'X', 'O' };

    private final int width, height;
    private final char[][] grid;
    private int lastCol = -1, lastTop = -1;
    private int X = 0 ;
    private int O = 0;
    private int limit = 0;
    
    public Connect4(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][];

        for (int h = 0; h < height; h++) {
            Arrays.fill(this.grid[h] = new char[width], '.');
        }
    }

    public String toString() {
        return IntStream.range(0, this.width)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining()) + "\n" +
               Arrays.stream(this.grid)
                     .map(String::new)
                     .collect(Collectors.joining("\n"));
    }

    /**
     * Prompts the user for a column, repeating until a valid
     * choice is made.
     */

    public void chooseAndDrop(char symbol, Scanner input) {
        do {
            System.out.print("\nPlayer " + symbol + " turn: ");
            int col = input.nextInt();

            if (! (0 <= col && col < this.width)) {
                System.out.println("Column must be between 0 and " +
                                   (this.width - 1));
                continue;
            }
            for (int h = this.height - 1; h >= 0; h--) {
                if (this.grid[h][col] == '.') {
                    this.grid[this.lastTop=h][this.lastCol=col] = symbol;
                    return;
                }
            }

            System.out.println("Column " + col + " is full.");
        } while (true);

    }

    /**
     * Detects whether the last chip played was a winning move.
     */
     public boolean isWinningPlay() {

        if (this.lastCol == -1) {
            throw new IllegalStateException("No move has been made yet");
        }
        char sym = this.grid[this.lastTop][this.lastCol];
         String streak = String.format("%c%c%c%c", sym, sym, sym, sym);
          return contains(this.horizontal(), streak) ||
               contains(this.vertical(), streak) ||
               contains(this.slashDiagonal(), streak) ||
               contains(this.backslashDiagonal(), streak);

    }



    /**
     * The contents of the row containing the last played chip.
     */
    private String horizontal() {

        return new String(this.grid[this.lastTop]);

    }

    /**
     * The contents of the column containing the last played chip.
     */
    private String vertical() {
        StringBuilder sb = new StringBuilder(this.height);
        for (int h = 0; h < this.height; h++) {
            sb.append(this.grid[h][this.lastCol]);
        }
        return sb.toString();
    }

    /**
     * The contents of the "/" diagonal containing the last played chip
     * (coordinates have a constant sum).
     */
    private String slashDiagonal() {
        StringBuilder sb = new StringBuilder(this.height);
        for (int h = 0; h < this.height; h++) {
            int w = this.lastCol + this.lastTop - h;
            if (0 <= w && w < this.width) {
                sb.append(this.grid[h][w]);
            }
        }
        return sb.toString();
    }

    /**
     * The contents of the "\" diagonal containing the last played chip
     * (coordinates have a constant difference).
     */
    private String backslashDiagonal() {
        StringBuilder sb = new StringBuilder(this.height);
        for (int h = 0; h < this.height; h++) {
            int w = this.lastCol - this.lastTop + h;
            if (0 <= w && w < this.width) {
                sb.append(this.grid[h][w]);
            }
        }
        return sb.toString();
    }

 // to reset the board
   public void reset(){
    for (int h = 0; h < height; h++) {
         Arrays.fill(this.grid[h] = new char[width], '.');
        }



  }   

   // to set the limitation of the score and check when the player wins

    public int scorelimit(int limity){

     int limitation = limity;
     this.limit = limitation;

      return this.limit;
   }

 
     public void endgame (){


   if(this.O == this.limit){
    System.out.println("Player O wins");
    System.exit(0);
    
  }  
   if(this.X == this.limit){
    System.out.println("Player X wins");
    System.exit(0);

  } 


  }
   // to display the Score board and set
     public int scorex (int x){
      int scoreX = this.X+x;
       this.X = scoreX;

      return scoreX;
     }

     public int scoreo (int o){
      int scoreO = this.O+o;
       this.O = scoreO;


      return scoreO;
    }

    private void scoreboard(){

         System.out.println("player O Score:" + this.O);
        
         System.out.println("player X Score:" + this.X);




    }



    private static boolean contains(String haystack, String needle) {
        return haystack.indexOf(needle) >= 0;
    }

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
        
            int height = 6, width = 8, moves = height * width;

            Connect4 board = new Connect4(width, height);
           
            System.out.println("CONNECT 4");

            System.out.println("Set the score limit " );
             int limit = input.nextInt();
           
            board.scorelimit(limit);

            System.out.println("Use 0-" + (width - 1) + " to choose a column.");

            System.out.println(board);

            for (int player = 0; moves-- > 0; player = 1 - player) {
               
                char symbol = players[player];
               
                board.chooseAndDrop(symbol, input);
             
                System.out.println(board);
             
                if (board.isWinningPlay()) {

                    if(symbol == 'X')
                    {

                    board.scorex(1);

                    }
                    if(symbol == 'O')
                         {
                    board.scoreo(1);

                    }
                    System.out.println("Player " + symbol + " wins!");
                    board.scoreboard();

                    break;



                }
            }
             // for us to loop again the board
           
              for(int touch = 0; touch < limit*2; touch++){  
              System.out.println("Would you like to countinue?");
             
              String i = input.next();
             
              switch(i){

           case "yes" :
           System.out.println("Use 0-" + (width - 1) + " to choose a column.");
           
           board.reset();
           
           System.out.println(board);

            for (int player = 0; moves-- > 0; player = 1 - player) {
                char symbol = players[player];
                board.chooseAndDrop(symbol, input);
                System.out.println(board);
                if (board.isWinningPlay()) {

                    if(symbol == 'X')
                    {
                    board.scorex(1);

                    }
                    if(symbol == 'O')
                         {
                    board.scoreo(1);

                    }
                    System.out.println("Player " + symbol + " wins the Round");
                    board.scoreboard();
                    board.endgame();
                   break;
                }
            }
                 break;
            case "No":
              System.out.println("Game over");
              System.exit(0);
              break;

              default:

              System.out.println("it's over");





    }


            }


}

}