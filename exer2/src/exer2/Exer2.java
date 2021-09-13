    /**
     * James Ryan A. Mocorro
     * Block B
     * Feb 22, 2021
     * Multiplacation Matrix
     */
    package exer2;

    public class Exer2 {
                    int matrix_a[][] = { {1,2,3}, {4,5,6} };
                    int matrix_b[][] = { {7,8}, {9,10}, {11,12} };

      public static void main(String args[]) {
                    product in = new product();
                    int a[][] = { {1,2,3}, {4,5,6} };
                    int b[][] = { {7,8}, {9,10}, {11,12} };
                    int col = 3;
                    int row = 3;


                    /*
                     * Lines 27-42 simply prints the contents of the two matrices
                     */
                    for(int i=0;i<2;i++) {   

                            for(int j=0;j<3;j++) {    
                                    System.out.print(a[i][j]+ " ");
                    }
                            System.out.println();//new line    
                    }

                    System.out.println("X");

                    for(int i=0;i<3;i++) {    
                            for(int j=0;j<2;j++) {    
                                    System.out.print(b[i][j]+ " ");
                    }
                            System.out.println();//new line    

                    }
                    int product [][] = new int [3][3];
                        for (int r = 0; r<a.length; r++){
                            for(int c = 0; c<b[0].length; c++){
                                for(int m = 0; m<b.length; m++){
                                  product [r][c] += a[r][m] * b[m][c];                 
                                  }
                            }
                        } 
                        System.out.println("_____________________________________________________________________________________________________________");
                        System.out.println("Result");
                      for(int i = 0; i<a.length; i++){
                         for(int j = 0; j<2; j++){

                             System.out.print(product[i][j] + " ");



      }
                         System.out.println();
    }
    }
    }