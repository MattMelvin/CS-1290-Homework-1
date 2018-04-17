public Node loopDection(Node head) {
     Node temp = head;
     HashSet<Node> set = new HashSet<Char>();
     
     while(temp != null) {
          if(!set.add(temp)) {
               return temp;
          }else {
               temp = temp.next;
          }
     }
     return head;
}
