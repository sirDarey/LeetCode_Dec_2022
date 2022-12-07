package leetcodeDec2022;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 6
 * Problem 328: Odd Even Linked List
 *
 */


class Day6_328_OddEvenLinkedList {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        
        ListNode odd = head, 
                 prev = odd,
                 even = head.next,
                 evenHead = even;
        
        while (odd != null && odd.next != null) {
            ListNode temp = odd.next.next;

            if (temp == null)
                prev = odd;
            else {
                prev = temp;
                even.next = temp.next;
                even = even.next;
            }
            
            odd.next = temp;
            odd = odd.next;
        }

        prev.next = evenHead;

        return head;
    }
}