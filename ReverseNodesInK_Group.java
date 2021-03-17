package Leetcode;

public class ReverseNodesInK_Group {

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        
        ListNode beforeHead = new ListNode(-1);
        beforeHead.next = head;
        
        head = beforeHead;
        while (head.next != null) {
            head = revNext(head, k);
        }
        
        return beforeHead.next;
    }
    

    private ListNode revNext(ListNode head, int k) {

        ListNode next = head; 
        for (int i = 0; i < k; i++) {
            if (next.next == null) {
                return next;
            }
            next = next.next;
        }
        
        ListNode node = head.next;
        ListNode pre = head, cur = node;
        for (int i = 0; i < k; i++) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        
        node.next = cur;
        head.next = pre;
        return node;
    }
}
