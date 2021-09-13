import java.io.*;

public class link {
    node head;
    int size;
    node tail;
    
    public link(){
    this.size = 0 ;
    }
   
    public void sulat(String str,String filer) 
    {

     node curNode = this.head;
     
     if(this.head == null){
         this.head = new node(str);
        
        
     }
     else{
        node lovely = new node(str,this.head); 
        this.head = lovely;


     }

        try{
            
     FileWriter filew = new FileWriter(filer);
    
     BufferedWriter bw2 = new BufferedWriter(filew);
     
     
        while( curNode != null ) {

       bw2.write(curNode.getStr());
       curNode = curNode.getnextnode();
       
      }
        

      bw2.close();

    } catch(Exception e) {

        System.out.println("An exception occured!");
    }
        

       
        
     }

    
}
       




    
    
  
    
   
    
