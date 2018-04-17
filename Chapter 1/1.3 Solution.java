public static String URLify(String S) {
    char[] array = new char[S.length()];
     
     for(int i = 0; i < S.length(); i++) {
     	if(S.charAt(i) == ' ') {
           	array[i] = '%';
            array[i+1] = '2';
            array[i+2] = '0';
        }else {
           	array[i] = S.charAt(i);
        }
     }
     String S2 = new String(array);
     return S2;
}
