public boolean isRotation(String s1, String s2) {
     if(!isSubstring(s1, s2)) {
          return false;
     }
     
     for(int i = 0; i < s1.length(); i++) {
          if(s1.charAt(i) != s2.charAt(s2.length()-i) {
               return false;
          }
     }
     return true;
}
