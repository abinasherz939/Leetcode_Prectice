package Programs.Tries;

public class CompleteString {

    class Node2 {
        Node links[] = new Node[26];
        boolean flag = false;

        public Node2() {

        }

        boolean containsKey(char ch) {
            return (links[ch - 'a'] != null);
        }
        Node get(char ch) {
            return links[ch-'a'];
        }
        void put(char ch, Node node) {
            links[ch-'a'] = node;
        }
        void setEnd() {
            flag = true;
        }
        boolean isEnd() {
            return flag;
        }
    };

    public static String completeString(int n, String[] a) {




    }
}
