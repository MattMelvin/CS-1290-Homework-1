public boolean intersects(Node head1, Node head2) {
     Node temp1 = head1;
     Node temp2 = head2;
     HashSet<Node> set = new HashSet<Node>();
     
     while(temp1 != null) {
          set.add(temp1)
          temp1 = temp1.next;
     }
     
     while(temp2 != null) {
          if(!set.add(temp2)) {
               return true;
          }
          temp2 = temp2.next;
     }
}
