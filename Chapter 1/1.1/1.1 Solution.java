public boolean uniqueCharacters(String S) {
     HashSet<Char> hash = new HashSet<Char>();
     
     for(int i = 0; i < S.length(); i++) {
          if(!(hash.add(S.charAt(i))) {
               return false;
          }
     }
     return true;
}
