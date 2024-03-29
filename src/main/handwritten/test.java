package handwritten;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/3/16
 * @Copyright: https://github.com/CatTailzz
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<Integer> list = Arrays.asList(arr[0]);
        System.out.println(list.get(0));
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        TreeSet<Integer> ts = new TreeSet<>();
        List<Integer> list1 = Arrays.asList(new Integer[3]);
        for(var c : list1) {
            System.out.println(c);
        }
        String s = String.valueOf(999);
        System.out.println(s);
        StringBuilder sb = new StringBuilder("123");
        sb.setCharAt(0,'2');
        System.out.println(sb);

    }
}
