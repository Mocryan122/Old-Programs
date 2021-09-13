public class Stack {
    Node head;
  
    
   
    public void push(char data){ 
      Node newChara = new Node(data, this.head);
      this.head = newChara;
    }
  
    public char pop(){
      if (head == null){
        return '-';

      }
      else{
        Node currNode = this.head;
        this.head = this.head.nextNode;
        return currNode.getVal();
      }
    }
  
  
    public void comPair(char charac) {
      Node thisNode = this.head;
          if (charac == ')') {
            if (thisNode.getVal() == '(') {
              pop();
            }
          }
          else if (charac == ']') {
            if (thisNode.getVal() == '[') {
              pop();
            } 
            
          }
          else if (charac == '}') {
            if (thisNode.getVal() == '{') {
              pop();
            } 
          }
    }
  
     
    public boolean isEmpty() {
      if (this.head == null) {
        return true;
      } return false;
    }

    class Node {
        
      char input;
      Node nextNode;
  
      public Node(char data) {
          this.input = data;  
        }
    
        public Node(char data, Node next) {
          this.input     = data;
          this.nextNode = next;
        }
    
        public char getVal() {
          return this.input;
        }
    }
  }