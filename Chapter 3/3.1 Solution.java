class multiStack {
  int capacity;
  int[] values;
  int[] sizes;
  
  public multiStack(int size) {
    capacity = size;
    values = new int[size * 3];
    sizes = new int[3];
  }
  
  void push(int stackNum, int value) {
    if(isFull(stackNum)) {
      return;
    }
    values[getTopIndex(stackNum)+1] = value;
    sizes[stackNum]++;
  }
  
  int pop(int stackNum) {
    if(isEmpty(stackNum)) {
      return 0;
    }
    int top = getTopIndex(stackNum);
    int value = values[top];
    values[top] = 0;
    sizes[stackNum]--;
    return value;
  }
  
  int peek(int stackNum) {
    if(isEmpty(stackNum)) {
       return 0;
    }
    int top = getTopIndex(stackNum);
    int value = values[top];
    return value;
  }
  
  int getTopIndex(int stackNum) {
    int offset = stackNum * capacity;
    int size = sizes[stackNum];
    return offset + size - 1;
  }
  
  boolean isFull(int stackNum) {
    if(sizes[stackNum} == capacity) {
      return true;
    }
    return false;
  }
  
  boolean isEmpty(int stackNum) {
    if(sizes[stackNum] == 0) {
      return true;
    }
    return false;
  }
