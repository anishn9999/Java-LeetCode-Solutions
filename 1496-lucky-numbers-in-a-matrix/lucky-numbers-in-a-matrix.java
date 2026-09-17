import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            int col = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == min) {
                    col = j;
                    break;
                }
            }
            boolean lucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                result.add(min);
            }
        }
        return result;
    }
}