package hot100;

import java.lang.management.MemoryType;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/17
 * @Copyright: https://github.com/CatTailzz
 */
public class h74_search_a_2d_matrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length, m = matrix[0].length;
            int l = 0, r = n * m - 1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (matrix[mid / m][mid % m] < target) {
                    l = mid + 1;
                } else if (matrix[mid / m][mid % m] > target){
                    r = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
