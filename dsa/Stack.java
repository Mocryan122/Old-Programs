/**
 * Mark Christopher R. Lumbay
 * CC12 - B
 * March 8, 2021
 * This is the code for the own implementation of a stack and it also contains some methods
 */

public class Stack {
  Node3 head;

  class Node3 {
      
    char input;
    Node3 nextNode;

    public Node3(char data) {
        this.input = data;  
      }
  
      public Node3(char data, Node3 next) {
        this.input     = data;
        this.nextNode = next;
      }
  
      public char getVal() {
        return this.input;
      }
  }
  
  /**
   * This will push data into the stack
   * @param data
   */
  public void push(char data){ 
    Node3 newChara = new Node3(data, this.head);
    this.head = newChara;
  }

  /**
   * This method will delete the top-most value of the stack and return it
   * Popping will not resume if stack is already empty
   */
  public char pop(){
    if (head == null){
      return '-';
    }
    else{
      Node3 currNode = this.head;
      this.head = this.head.nextNode;
      return currNode.getVal();
    }
  }

  /**
   * This will check wether the closing bracket is a pair with the top-most value of the stack
   * It first determines what kind of closing bracket it is (Parenthesese, square, or curly brackets)
   * If it is a pair, it will pop the opening bracket from the stack
   * @param chara
   */
  public void ifPair(char chara) {
    Node3 thisNode = this.head;
        if (chara == ')') {
          if (thisNode.getVal() == '(') {
            pop();
          }
        }
        else if (chara == ']') {
          if (thisNode.getVal() == '[') {
            pop();
          } 
          
        }
        else if (chara == '}') {
          if (thisNode.getVal() == '{') {
            pop();
          } 
        }
  }

  /**
   * This method will just check if the stack is empty
   */
  public boolean isEmpty() {
    if (this.head == null) {
      return true;
    } return false;
  }
}