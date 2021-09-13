
package activity.pkg2.insert.delete.add.array.exit;

import java.util.Scanner;

public class Activity2InsertDeleteAddArrayExit {

    public static void main(String[] args) {
  
 
        Scanner sulod = new Scanner(System.in);
         System.out.println("WELCOME");
          System.out.print("How many values do you want?");
           System.out.println(" ");
           
            int taas; 
              taas = sulod.nextInt();
 
                int a [] = new int [taas];
                
               System.out.println("Enter your values");
                    for(int x = 0; x < taas ; x++){
                        a[x] = sulod.nextInt();
                         }
                        // for insertion
                          for(int z = 1; z < a.length ; z++){
                            int current =  a[z];
                            int i = z-1;
                            while((i > -1) && (a[i]> current)){
                            a[i+1] = a[i];
                            i--;
                            }
                            a[i+1] = current;
                         }     
                     
                      // for printing the values
               System.out.println("This are the values of your array");
                      for(int x = 0; x < taas ; x++){
                        System.out.print( a[x] + " " );
                         }    
                        System.out.println(" ");
                    
                      for(int t = 0; t<15; t++){
                        System.out.println("Hey,What is your next move?");
                         System.out.print("delete, ");
                          System.out.print("insert, ");
                           System.out.print("exit");
                            System.out.println();
                  
                           String choices = sulod.next(); 
                           
                            switch(choices){
                                case "delete":
                                      System.out.println("what number would you delete");
                                      int wala = sulod.nextInt();
                                      
                                      
                                      for(int x= 0; x < a.length; x++){
                                        if(a[x] == wala ){
                                        a[x] = 0; 
                                        }
                                        
                                      }
                                      // for insertion
                                          for(int z = 1; z < a.length ; z++){
                                           int current =  a[z];
                                            int i = z-1;
                                              while((i > -1) && (a[i]> current)){
                                               a[i+1] = a[i];
                                                   i--;
                                                     }
                                                      a[i+1] = current;
                                                        }     
                                      
                                        for(int x= 0; x < a.length; x++){
                                       System.out.print( a[x] + " " );
                                      }
                                      
                                      
                                      
                                      break;
                               
                                case "insert":
                                     
                                    
                                    System.out.println("first delete a number");
                                      
                                    int out = sulod.nextInt();
                                      for(int x= 0; x < a.length; x++){
                                        if(a[x] == out ){
                                        a[x] = 0; 
                                        }
                                      }
                                      
                                    System.out.println("what number you want to insert");
                                    int add = sulod.nextInt();
                                    
                                    for(int k= 0; k < a.length ; k++){
                                       
                                        if(a[k] == 0){
                                         a[k] = add;
                                      }
                                    }
                                     
                                    // insertion
                                     for(int z = 1; z < a.length ; z++){
                                        int current =  a[z];
                                          int i = z-1;
                                             while((i > -1) && (a[i]> current)){
                                               a[i+1] = a[i];
                                                  i--;
                                                     }
                                                     a[i+1] = current;
                                                     }     
                                       
                                    for(int k= 0; k < a.length ; k++){
                                     System.out.print( a[k] + " " );
                                     }
                                   
                                      break;
                               
                                
                                
                                case "exit":
                                System.out.print( "Thank you" );
                                System.exit(0);
                                
                                 
                                 default:
                                System.out.println("try again.");
        
                            }
            }
    }
}
   
    

