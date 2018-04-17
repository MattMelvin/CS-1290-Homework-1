public int[][] zeroMatrix(int[][] matrix) {
     for(int i = 0; i < matrix.length; i++) {
          for(int j = 0; j < matrix.length; j++) {
               if(matrix[i][j] == 0) {
                    for(int k = 0; k < matrix.length; k++) {
                         matrix[i][k] = 0;
                         matrix[k][j] = 0;
                    }
                    i++;
                    j++;
               }
          }
     }
     return matrix;
}
