package rotateImage;

class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;

        for(int i = size; i > 1; i = i-2){
            int min = (size-i)/2;
            int max = min + i -1;
            for(int j = 0; j < i-1; j++){
			 
                int temp = matrix[max-j][min];
                matrix[max-j][min] = matrix[max][max-j];
                matrix[max][max-j] = matrix[min+j][max];
                matrix[min+j][max] = matrix[min][min+j];
                matrix[min][min+j] = temp;
            }
        }
        return;
    }
    
}