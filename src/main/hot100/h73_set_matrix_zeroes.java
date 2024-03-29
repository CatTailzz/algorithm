package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h73_set_matrix_zeroes {

    class Solution {
        public void setZeroes(int[][] matrix) {
            int n = matrix.length, m = matrix[0].length;
            int f1 = 0, f2 = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][0] == 0) {
                    f1 = 1;
                    break;
                }
            }
            for (int i = 0; i < m; i++) {
                if (matrix[0][i] == 0) {
                    f2 = 1;
                    break;
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (f1 == 1) {
                for (int i = 0; i < n; i++) {
                    matrix[i][0] = 0;
                }
            }

            if (f2 == 1) {
                for (int i = 0; i < m; i++) {
                    matrix[0][i] = 0;
                }
            }
        }
    }
}
