public boolean isPalindrome(Node head) {
     Node reversed = reverse(head);
     
     while(head != null && reversed != null) {
          if(head.data != reversed.data) {
               return false;
          }
          head = head.next;
          reversed = reversed.next;
     }
     return true;
}

Node reverse(Node head) {
     Node newHead = null;
     while(head != null) {
          Node n = new Node(head.data);
          n.next = newHead;
          newHead = n;
          head = head.next;
     }
     return head;
}
