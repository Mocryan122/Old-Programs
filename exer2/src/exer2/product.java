/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2;

/**
 *
 * @author RYAN
 */
public class product {
      
       int matrix_a[][] = { {1,2,3}, {4,5,6} };
       int matrix_b[][] = { {7,8}, {9,10}, {11,12} };

 
      public static int[][] result(int[][]a , int[][]b){
                    int product [][] = null;
                    for (int r = 0; r<a.length; r++){
                        for(int c = 0; c<b[0].length; c++){
                            for(int m = 0; m<b.length; m++){
                              product [r][c] += a[r][m] * b[m][c];                 
                              }
                        }
                    } 
                    return product;
}
}