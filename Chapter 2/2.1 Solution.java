Node removeDups(Node n) {
     HashSet<Integer> set = new HashSet<Integer>();
     Node prev = null;
     
     while(n != null) {
          if(set.contains(n.data) {
               prev.next = n.next;
          }else {
               set.add(n.data);
               prev = n;
          }
          n = n.next;
     }
}
