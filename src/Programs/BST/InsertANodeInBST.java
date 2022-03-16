package Programs.BST;


public class InsertANodeInBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null ) root = new TreeNode(val);
//        TreeNode place = findCeilNode(root, val);
//        TreeNode newNode = new TreeNode(val);
//        if (place == null){
//            TreeNode temp = root;
//            while (temp.right != null) temp = temp.right;
//            temp.right = newNode;
//        }
//        if (place.left == null) place.left = newNode;
//        else {
//            newNode.left = place.left;
//            place.right = newNode;
//        }T
        TreeNode current = root;

        while (true){
            if (current.val <= val){

                if (current.right != null) current = current.right;
                else {
                    current.right = new TreeNode(val);
                    break;
                }
            }else {
                if (current.left!= null) current = current.left;
                else {
                    current.left = new TreeNode(val);
                    break;
                }


            }
        }

        return root;

    }
//    TreeNode findCeilNode(TreeNode root, int val){
//
//        TreeNode ceilNode = null;
//        while(root != null){
//
//            if (root.val == val){
//                return root;
//            }
//            if (root.val<val) root = root.right;
//            else {
//                ceilNode = root;
//                root = root.left;
//            }
//
//        }
//        return ceilNode;
//    }
}
