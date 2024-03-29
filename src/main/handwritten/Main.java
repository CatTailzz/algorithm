package handwritten;



import java.io.*;
import java.util.Scanner;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/1/22
 * @Copyright: https://github.com/CatTailzz
 */
public class Main {

    public static class Tire {
        class Node {
            Node[] child = new Node[70];
            boolean isEnd;
            int score;
        }

        public Node root;

        public Tire() {
            root = new Node();
        }

        private int getNum(char c) {
            if (c >= 'a' && c <= 'z') {
                return c - 'a';
            } else if(c >= 'A' && c <= 'Z'){
                return c - 'A' + 26;
            } else {
                return c - '0' + 52;
            }
        }

        public void insert(String word) {
            insert(word, root);
        }

        public void insert(String word, Node root) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                int num = getNum(c);
                if (cur.child[num] == null) {
                    cur.child[num] = new Node();
                }
                cur = cur.child[num];
                cur.score++;
            }
            cur.isEnd = true;
        }

        public int search(String word) {
            return search(word, root);
        }

        public int search(String word, Node root) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                int num = getNum(c);
                if (cur.child[num] == null) {
                    return 0;
                }
                cur = cur.child[num];
            }
            return cur.score;
        }
    }



    public static void main(String[] args) throws IOException{
//        Scanner in = new Scanner(System.in);
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        for(int i = 0; i < 10; i++) {
            in.ordinaryChar('0' + i); // 把 '0'-'9' 的字符当作普通字符而不是特殊数字
        }
        in.nextToken();
        int n = (int)in.nval;
        while (n-- > 0) {
            in.nextToken();
            int t = (int)in.nval;
            in.nextToken();
            int q = (int)in.nval;
            Tire tire = new Tire();

            while(t-- > 0) {
                in.nextToken();
                String line = in.sval;
                System.out.println(line);
                tire.insert(line);
            }
            while(q-- > 0) {
//                try {
//                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//                    int res = tire.search(in.next());
//                    out.write(res);
//                    out.flush();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
                in.nextToken();
                String line = in.sval;
                System.out.println(tire.search(line));
            }
        }
    }
}
