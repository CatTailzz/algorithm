package hot100;

/**
 * @description:
 * @author：CatTail
 * @date: 2024/2/5
 * @Copyright: https://github.com/CatTailzz
 */
public class h208_implement_trie_prefix_tree {

    class Trie {
        private Trie[] son;
        private boolean isEnd;

        public Trie() {
            son = new Trie[26];
            isEnd = false;
        }

        public void insert(String word) {
            Trie cur = this;
            for (var c : word.toCharArray()) {
                c -= 'a';
                if (cur.son[c] == null) {
                    cur.son[c] = new Trie();
                }
                cur = cur.son[c];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            Trie cur = this;
            for (var c : word.toCharArray()) {
                c -= 'a';
                cur = cur.son[c];
                if (cur == null) {
                    return false;
                }
            }
            return cur.isEnd;
        }

        public boolean startsWith(String prefix) {
            Trie cur = this;
            for (var c : prefix.toCharArray()) {
                c -= 'a';
                cur = cur.son[c];
                if (cur == null) {
                    return false;
                }
            }
            return true;
        }
    }
}
