package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 5
 * Problem 876: Middle of the Linked List
 *
 */


class Day5_876_MiddleOfTheLinkedList {
    
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;
        if (head.next.next == null)
            return head.next;

        ListNode slow = head, fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
}