//package Programs.Tries;
//
//class Node {
//    Node[] links = new Node[27];
//    boolean flag = false;
//
//    public Node() {
//    }
//    boolean containsKey(char ch) {
//        return (links[ch - 'a'] != null);
//    }
//    Node get(char ch) {
//        return links[ch-'a'];
//    }
//    void put(char ch, Node node) {
//        links[ch-'a'] = node;
//    }
//    void setEnd() {
//        flag = true;
//    }
//    boolean isEnd() {
//        return flag;
//    }
//}
//
//class MagicDictionary {
//
//    public Node root;
//    public MagicDictionary() {
//        root = new Node();
//    }
//
//    public void addWord(String word) {
//        Node node  = root;
//        for (int index = 0; index < word.length(); index++) {
//            if (!node.containsKey(word.charAt(index))){
//                node.put(word.charAt(index), new Node());
//            }
////            node = node.links[word.charAt(index)];
//            node = node.get(word.charAt(index));
//        }
//        node.setEnd();// flag true kar rhe yha
//    }
//
//    public void buildDict(String[] dictionary) {
//
//        for(int i = 0; i< dictionary.length;i++){
//            addWord(dictionary[i]);
//
//        }
//    }
//
//
//
//    public boolean search(String word) {
//        Node node = root;
//        for (int index = 0; index < word.length(); index++) {
//            if (!node.containsKey(word.charAt(index)))return false;
//            node =  node.get(word.charAt(index));
//        }
//        return node.isEnd();
//    }
//}
//
///**
// * Your MagicDictionary object will be instantiated and called as such:
// * MagicDictionary obj = new MagicDictionary();
// * obj.buildDict(dictionary);
// * boolean param_2 = obj.search(searchWord);
// */
