


public class node {
    String data;
    node nextnode;
    
public node(){
    
}   

public node (String data){
this.data = data;

}


public node (String data, node next){
    this.data = data;
    this.nextnode = next;
}
// set and get

public void setdata(String data){
    
    this.data = data ;
    
}

public void setnextnode(node next){
    
    this.nextnode = next ;
}

public String getdata(){

    return this.data;
}

public node getnextnode(){
    return this.nextnode;
}

public String getStr() {
    return this.data;
}


    


    
}
