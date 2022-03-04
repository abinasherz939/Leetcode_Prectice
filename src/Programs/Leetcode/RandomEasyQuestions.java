package Programs.Leetcode;

public class RandomEasyQuestions {

    public boolean isUgly(int n) {

        while(n!= 1){
            if (n%2 == 0) n/=2;
            else if (n%3== 0) n/=3;
            else if (n%5 == 0) n/=5;
            else return false;
        }
        return true;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode forwardPointer = head.next, backPointer = head;
        while(forwardPointer!= null){
            while(forwardPointer.val%2 == 0&&forwardPointer!= null) forwardPointer = forwardPointer.next;
            while((backPointer.val %2) != 0&& backPointer != null) backPointer = backPointer.next;
            ListNode temp = new ListNode(Integer.MIN_VALUE);
            temp.val = forwardPointer.val;
            forwardPointer.val = backPointer.val;
            backPointer.val = temp.val;
        }
        return head;
    }
}
