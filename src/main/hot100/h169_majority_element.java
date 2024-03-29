package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/25
 * @Copyright: https://github.com/CatTailzz
 */
public class h169_majority_element {

    class Solution {
        public int majorityElement(int[] nums) {
            int card = 0, cnt = 0;
            for (int num : nums) {
                if (num != card) {
                    cnt--;
                    if (cnt < 0) {
                        card = num;
                        cnt = 1;
                    }
                } else {
                    cnt++;
                }
            }
            return card;
        }
    }
}
