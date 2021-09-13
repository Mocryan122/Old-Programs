/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;


public class link {
    node head;
    int size;
    node tail;
    
    public link(){
    
    this.size = 0 ;
    }
   
    public void setsize (int size){
        this.size = size;
    }
    public int getsize(){
        return this.size;
    
    }
    public void printlist(){
     node thisnode = this.head;
     while(thisnode!= null){
         System.out.print(thisnode.data + " -> ");
           thisnode = thisnode.getnextnode();  
     }
     
    }
    
    public boolean delete(int data){
    node prevnode = null;
    node thisnode = this.head;
    
    while(thisnode.nextnode != null){
        if(thisnode.getdata()== data ){
        prevnode.setnextnode(thisnode.getnextnode());
        this.setsize(this.getsize() - 1);
        
        return true;
        }
    prevnode = thisnode;
    thisnode = thisnode.getnextnode();
    
    } 
        return false;
    
        
    
    }
     
    
    public void append(int data){
       if(this.head == null){
        this.head = new node(data);
        setsize(getsize()+1);
        return;
    } 
        node thisnode =this.head;
        while (thisnode.getnextnode() != null) thisnode = thisnode.getnextnode();
        thisnode.setnextnode(new node(data));
        setsize(getsize()+1);
    }
    
    
    public node prepend(int data)
    {
       node newnode = new node(data, this.head); 
        this.head = newnode;
        
        this.size++ ;
        return newnode;
    }
    
    public node find(int data) {
    node thisnode = this.head;
    while (thisnode.getnextnode() != null) {
      if (thisnode.getdata() == data) return thisnode;
      thisnode = thisnode.getnextnode();
    }
    return null;
  }
    
     public node insert(int data, int before_data) {

    node thisNode = this.head;
    node prevNode = null;

    // find the data
    while(thisNode != null) {
        if (thisNode.getdata() == before_data) { 
          node newnode = new node(data, thisNode);
          prevNode.setnextnode(newnode);
          setsize(getsize()+1);
          return newnode;
        }
        prevNode = thisNode;
        thisNode = thisNode.getnextnode();
    }

    append(data);
    setsize(getsize()+1);
    return null;
  }
}