package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/13
 * @Copyright: https://github.com/CatTailzz
 */
public class h240_search_a_2d_matrix_ii {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length, m = matrix[0].length;
            int x = 0, y = m - 1;
            while (x < n && y >= 0) {
                if (matrix[x][y] == target) {
                    return true;
                } else if (matrix[x][y] > target) {
                    y--;
                } else {
                    x++;
                }
            }
            return false;
        }
    }

}
