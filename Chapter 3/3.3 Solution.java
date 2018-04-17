class SetOfStacks() {
  ArrayList<Stack> stacks = new ArrayList<Stack>();
  
  void push(int value) {
    Stack current = getCurrentStack();
    
    if(current != null && !current.isFull()) {
      current.push(value);
    }else {
      Stack newStack = new Stack(capacity);
      newStack.push(value);
      stacks.add(stack);
    }
  }
  
  int pop() {
    Stack current = get currentStack();
    
    if(current == null) {
      return 0;
    }else {
      int value = current.pop;
      if(current.size == 0) {
        stacks.remove(stacks.size() - 1);
      }
      return v;
    }
  }
