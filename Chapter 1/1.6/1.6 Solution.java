public String stringCompression(String S) {
     StringBuilder sb = new StringBuilder();
     
     int count = 0;
     for(int i = 0; i < S.length()-1; i++) {
          count++;
          if(S.charAt(i) != S.charAt(i+1))   {
               sb.append(S.charAt(i));
               sb.append(count);
               count = 0;
          }
     }
     
     String compressed = sb.toString();
     if(compressed.length() >= S.length()) {
          return S;
     }else {
          return compressed;
     }
}
