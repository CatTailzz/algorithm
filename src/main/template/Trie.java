package template;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class Trie {

    class Node {
        Node[] son = new Node[26];
        int score;
        boolean isEnd;
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    void insert(String word, Node root) {
        Node cur = root;
        for (var c : word.toCharArray()) {
            c -= 'a';
            if (cur.son[c] == null) {
                cur.son[c] = new Node();
            }
            cur = cur.son[c];
        }
        cur.isEnd = true;
    }

    boolean search(String word, Node root) {
        Node cur = root;
        for (var c : word.toCharArray()) {
            c -= 'a';
            cur = cur.son[c];
            if (cur == null) {
                return false;
            }
        }
        return cur.isEnd;
    }
}
