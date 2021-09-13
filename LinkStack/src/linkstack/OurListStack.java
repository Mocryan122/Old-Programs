
public class OurListStack {

    node head;
  
    int size;
    node tail;
    
    public OurListStack(){
    
    this.size = 0 ;  
    node kaninode = this.head;
    }
   
    public void setsize (int size){
        this.size = size;
    }
    public int getsize(){
        return this.size;
    
    }
    public void print(){
     node thisnode = this.head;
     while(thisnode!= null){
         System.out.print(thisnode.data + " -> ");
           thisnode = thisnode.getnextnode();  
     }
     
    }
    
    public boolean isEmpty() {
    if (this.size == 0) {
      return true;
    } else {
      return false;
    }
  }
    
    public int pop(){
        node curr = this.head;
        node prev = null;
        node kaninode = this.head;
        
 if (isEmpty()) {
      System.out.println("");
      System.out.println("Stack is empty");
      return 0;
    } else {
      System.out.println("");
      System.out.print("Popping the number :");
      while(curr.getnextnode() != null){
      curr = curr.getnextnode();
      prev = kaninode;
      kaninode = kaninode.getnextnode();
      
      }
      
      if(prev == null){
          this.head = null;
      }
      else{
          prev.setnextnode(null);
      }
      
      size--;
      return kaninode.data;
      }
   
    
    }
   
    
    public node push(int data)
    {
       if(this.head == null){
           
        this.head = new node(data);
        setsize(getsize()+1);
        return null;
    } 
        node thisnode =this.head;
        while (thisnode.getnextnode() != null) thisnode = thisnode.getnextnode();
        thisnode.setnextnode(new node(data));
        setsize(getsize()+1);
      return null;
    }
    
    public node find(int data) {
    node thisnode = this.head;
    while (thisnode.getnextnode() != null) {
      if (thisnode.getdata() == data) return thisnode;
      thisnode = thisnode.getnextnode();
    }
    return null;
    

    
    }
}