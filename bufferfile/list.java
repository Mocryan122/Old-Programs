public class list {
    node head;
    int size;
    node tail;
    
    public list(){
    
    this.size = 0 ;
    }
   
     public node prepend(String data)
    {
       node newnode = new node(data, this.head); 
        this.head = newnode;
        
        this.size++ ;
        return newnode;
    }
    
}
