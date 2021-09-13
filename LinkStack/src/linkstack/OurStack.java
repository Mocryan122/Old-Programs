
package linkstack;

/**
 *
 * @author RYAN
 */
class OurStack {

  int data[];
  int index;        // index current location of the last input, else -1
  int size;

  /**
    * @param int size of the array *stack
    */
  public OurStack(int size) {
    this.size = size;
    this.data = new int[this.size];
    this.index = -1;
  }

  /**
    * check if the stack is full
    * @return boolean, true if the stack is full, false otherwise
    */
  public boolean isFull() {
    if (this.size == (this.index + 1)) {      // ===> to be verified
      return true;
    } else {
      return false;
    }
  }

  /**
    * push add element into the stack
    * @param int the value to be added
    */
  public void push(int value) {
    // check if the stack is full ?
    if (isFull()) {
      System.out.println("The Stack is Full.");
    } else {
      this.index++;
      this.data[this.index] = value;
    }
  }

  /**
    * Returns the current size of the stack
    * @return int the size of the stack
    */
  public int size() {
    if (this.index == -1) {
      return 0;
    } else {
      return this.index + 1;    // ==> to be verified
    }
  }

  /**
    * print the contents of the stack
    */
  public void print() {

    for (int ctr = 0; ctr <= this.index; ctr++) {
      System.out.print(this.data[ctr] + " -> ");
    }
    System.out.println();
  }

  /**
    * check if the stack is empty
    * @return boolean, true if the stack is empty, otherwise false
    */
  public boolean isEmpty() {
    if (this.index == -1) {
      return true;
    } else {
      return false;
    }
  }

  /**
    * return the last inputted integer from the stack
    * @return int the value
    */
  public int pop() {
    // check if the stack empty
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      int temp = this.data[this.index];
      this.index--;
      return temp;
     
    }
  }

  // peek()
  // search(int value)
}

