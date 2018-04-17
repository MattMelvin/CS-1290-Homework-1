Node kthToLast(Node n, int k) {
     Node n1 = n;
     Node n2 = n;
     
     for(int i = 0; i < k; i++) {
          if(n1 == null) {
               return null;
          }
          n1 = n1.next;
     }
     
     while(n1 != null) {
          n1 = n1.next;
          n2 = n2.next;
     }
     return n2;
}
