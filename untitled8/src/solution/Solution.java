package solution;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode cur = head;
        ListNode nex = head.next;
        while (cur != null && nex != null) {
            if (cur.val == nex.val) {
                nex = nex.next;
                continue;
            } else {
                cur = cur.next;
            }

        }
        return head;
    }
}