
public class LinkStack {

   public static void main(String[] args) {

      OurListStack stack = new OurListStack();    // arg the size of the stack
    
     stack.push(50);
     stack.push(12);
     stack.push(40);
     stack.push(70);
     stack.push(80);
     
     
    

      System.out.println("the stack is = " + stack.getsize());     // => 5
      System.out.println();
      stack.print();                        // => 50->12->40->70->80
      System.out.println();
      System.out.println(stack.pop());       // => 80
      System.out.println(stack.pop());       // => 70
      System.out.println();
      System.out.println("the stack is = " + stack.getsize());     // => 3
       
      System.out.println();
      
      stack.print();                        // => 50->12->40

      System.out.println();
      System.out.println(stack.pop());      // => 40
      System.out.println(stack.pop());      // => 12
      System.out.println(stack.pop());      // => 50
      System.out.println(stack.pop());      // empty
      
  }
}

    

