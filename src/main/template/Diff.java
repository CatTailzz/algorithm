package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/15
 * @Copyright: https://github.com/CatTailzz
 */
public class Diff {
    //处理区间修改
    //比如想对数组a的a[l...r]的每个元素+x,然后快速求出某个元素的值
    static int n = 1000;
    static int[] nums = new int[n + 1];
    static int[] diff = new int[n + 1];
    public static void insert(int l, int r, int c) {
        diff[l] += c;
        diff[r + 1] -= c;
    }
    public static void main(String[] args) {
        //初始化
        for (int i = 1; i <= n; i++) {
            insert(i, i, nums[i - 1]);
        }

        //重新由diff[i]得到nums[i - 1]
        //diff[i] += diff[i - 1];
    }



}
