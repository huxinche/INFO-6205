package setMatrixZeros;

public class Solution {
	 public void setZeroes(int[][] matrix) {
	     if (matrix == null || matrix.length == 0) {
	    	 return;
	     }
	     
	     if(matrix[0].length == 0) {
	    	 return;
	     }
	     
	     int l = matrix.length;
	     int k = matrix[0].length;
	     boolean row=false;
	     boolean collum=false;
	     
	     for (int i = 0; i < l; i++)
	         for (int j = 0; j < k; j++){
	             if (matrix[i][j] == 0) {
	                 matrix[0][j] = 0;
	                 matrix[i][0] = 0;
	                 if (i == 0) row = true;
	                 if (j == 0) collum = true;
	             }
	         }
	     
	     for (int i = 1; i < l; i++){
	         if (matrix[i][0] == 0){
	             for (int j = 1; j < k;j++)
	                 matrix[i][j] = 0;
	         }
	     }
	     
	     for (int j = 1; j < k; j++){
	         if (matrix[0][j] == 0){
	             for (int i = 1; i < l; i++)
	                 matrix[i][j] = 0;
	         }
	     }
	     
	     if (row){
	         for (int j = 0; j < k; j++)
	             matrix[0][j] = 0;
	     }
	     
	     if (collum){
	         for(int i = 0; i < l; i++)
	             matrix[i][0] = 0;
	     }
	  }
	}