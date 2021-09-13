/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkstack;

/**
 *
 * @author RYAN
 */
public class node {
    int data;
    node nextnode;
    
public node(){
    
}   

public node (int data){
this.data = data;

}


public node (int data, node next){
    this.data = data;
    this.nextnode = next;
}
// set and get

public void setdata(int data){
    
    this.data = data ;
    
}

public void setnextnode(node next){
    
    this.nextnode = next ;
}

public int getdata(){

    return this.data;
}

public node getnextnode(){
    return this.nextnode;
}


    
}
