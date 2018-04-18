class MyQueue<Node> {
  Stack<Node> S1; //Newest on top
  Stack<Node> S2; //Oldest on top
  
  public MyQueue() {
    S1 = new Stack<Node>();
    S2 = new Stack<Node>();
  }
  
  void add(Node N) {
    S1.push(N);
  }
  
  Node remove() {
    reverseOrder();
    return S2.pop();
  }
  
  void reverseOrder() {
    while(!S1.isEmpty()) {
      S2.push(S1.pop());
    }
  }
  
  Node peek() {
    reverseOrder();
    return S2.peek();
  }
}
