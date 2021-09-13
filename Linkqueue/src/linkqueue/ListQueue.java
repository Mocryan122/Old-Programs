/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkqueue;

/**
 *
 * @author RYAN
 */
public class ListQueue {
     node head;
  
    int size;
    node tail;
    
    public ListQueue(){
    
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
    if (this.size == 1) {
      return true;
    } else {
      return false;
    }
  }
    
    public int dequeue(){
       this.size--;
    System.out.print("Dequeue: ");
    if (head == null) {
      return 0;
    } 
    else {
      node Head = this.head;
      this.head = Head.nextnode;
      return Head.data;
    }
   
    }
    public node enqueue(int data)
    {
       System.out.println("Enqueue :"+data + " " );
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

