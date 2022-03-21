package Programs.Tries;

class Node1 {
    Node links[] = new Node[26];
    boolean flag = false;

    public Node1() {

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



class Trie4 {

    private static Node root;
    Trie4() {//Initialize your data structure here
        root = new Node();
    }


    public static void insert(String word) {
        Node node  = root;
        for (int index = 0; index < word.length(); index++) {
            if (!node.containsKey(word.charAt(index))){
                node.put(word.charAt(index), new Node());
            }
//            node = node.links[word.charAt(index)];
            node = node.get(word.charAt(index));
        }
//        node.setEnd();// flag true kar rhe yha
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        Node node = root;
        for (int index = 0; index < word.length(); index++) {
            if (!node.containsKey(word.charAt(index)))return false;
            node =  node.get(word.charAt(index));
        }
//        return node.isEnd();
        return true;
    }


    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        Node node = root;
        for (int index = 0; index < prefix.length(); index++) {
            if (!node.containsKey(prefix.charAt(index))) return false;
            node = node.get(prefix.charAt(index));
        }
        return true;
    }
}