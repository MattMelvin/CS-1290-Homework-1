void sort(Stack<Integer> S) {
  Stack<Integer> S2 = new Stack<Integer>();
  
  while(!S.isEmpty()) {
    int temp = S.pop();
    
    while(!S2.isEmpty && S2.peek() > temp) {
      S.push(S2.pop());
    }
    S2.push(temp);
  }
  
  while(!S2.isEmpty()) {
    S.push(S2.pop());
  }
}
