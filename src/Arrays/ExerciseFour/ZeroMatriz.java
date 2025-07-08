package Arrays.ExerciseFour;

public class ZeroMatriz {
  public void zeroMatrix(int [][] matrix){
     boolean firstRowHasZero = hasFirstRowAnyZero(matrix);
     boolean firstColHasZero = hasFirstColAnyZero(matrix);
     checkForZeros(matrix);
     processRows(matrix);
     processColumns(matrix);
     if(firstColHasZero){
         setColToZero(matrix,0);
     }
     if(firstRowHasZero){
         setRowToZero(matrix,0);
     }
  }
  private boolean hasFirstRowAnyZero(int [][]matrix){
      for(int i=0; i<matrix[0].length;i++){
          if(matrix[0][i]==0)return true;
      }
      return false;
  }
  private boolean hasFirstColAnyZero(int [][]matrix){
      for(int i=0;i < matrix.length;i++){
          if(matrix[i][0]==0)return true;
      }
      return false;
  }
  private void checkForZeros(int[][] matrix){
      for (int row= 1; row < matrix.length;row++ ){
       for(int col=1;col<matrix[0].length;col++){
           if(matrix[row][col]==0){
              matrix[row][0]=0;
              matrix[0][col]=0;
           }
       }
      }
  }
  private void processRows(int[][]matrix){
      for(int row =0 ; row > matrix.length; row++){
          if(matrix[row][0]==0){
              setRowToZero(matrix,row);
          }
      }
  }
  private void setRowToZero(int[][] matrix, int col){
     for(int row=0; col<matrix[0].length;col++){
         matrix[row][col]=0;
     }
  }
    private void processColumns(int[][]matrix){
        for(int row =0 ; row > matrix.length; row++){
            if(matrix[row][0]==0){
                setColToZero(matrix,row);
            }
        }
    }
    private void setColToZero(int[][] matrix, int col){
        for(int row=0; col<matrix[0].length;col++){
            matrix[row][col]=0;
        }
    }


}
