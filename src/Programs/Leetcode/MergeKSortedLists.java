package Programs.Leetcode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1) return lists[0];
        ListNode temp = null;
        for (int i = 0; i < lists.length-1; i++) {
            if(i == 0) temp =  mergeLists(lists[i], lists[i+1]);
            else temp =  mergeLists(temp,lists[i+1] );
        }

        return temp;

    }

    private ListNode mergeLists(ListNode list1, ListNode list2){

        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        if(list1 == null && list2 == null) return null;
        if (list1 == null ) return list2;
        if (list2 == null) return list1;
        if (list1.val <= list2.val)dummyNode.next = list1;
        else dummyNode.next = list2;
        ListNode currentNode = dummyNode;

        while (list1 != null && list2 != null){
            if(list1.val<= list2.val) {
                ListNode temp = new ListNode(list1.val);
                currentNode.next = temp;
                currentNode = currentNode.next;
                list1 = list1.next;
            }
            else {
                ListNode temp = new ListNode(list2.val);
                currentNode.next = temp;
                currentNode = currentNode.next;
                list2 = list2.next;
            }
        }
        if (list1 == null&& list2!=null) currentNode.next = list2;
        else currentNode.next = list1;
        return dummyNode.next;
    }

}
