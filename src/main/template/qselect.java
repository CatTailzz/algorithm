package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
//快排找第k大/小的数
public class qselect {

    private int[] nums;

    private int qselect(int l, int r, int k) {
        if (l == r) {
            return nums[k];
        }
        int x = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (nums[i] < x);
            do {
                j--;
            } while (nums[j] > x);
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        if (k <= j) {
            return qselect(l, j, k);
        } else {
            return qselect(j + 1, r, k);
        }
    }
}
