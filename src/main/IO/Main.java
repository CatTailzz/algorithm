package IO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/22
 * @Copyright: https://github.com/CatTailzz
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] value = in.nextLine().split(" ");

        Arrays.sort(value);
        for(int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
            if(i != value.length - 1){
                System.out.print(" ");
            }
        }
    }
}

/**
 * String s = in.next();
 * double t = in.nextDouble();
 * String s = in.nextLine();
 *
 * ‼️所有的next都是忽略前面空格，遇到回车截止。所以如果一行读完了但回车符还没读完，可以用nextLine吃一下。
 *
 * in.hasNext() 检查是否有非空字符
 * in.hasNextLine() 检查是否有换行符，用正则表达式匹配的
 *
 * 处理整行数据，读String转int
 * String[] value = s.split(" ");
 * each element: Integer.valueOf(value[i])
 * 😄or use lambda
 * List<Integer> collect = Arrays.stream(s.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
 *
 * 如果先读取了nextInt再读取nextLine,最好用nextLine代替nextInt：int n = Integer.parseInt(in.nextLine());
 */