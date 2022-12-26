package Sorts;
/*
 * Learning that mergeSort is two seperate sub routines.
 */

public class mergeSort {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            ListNode temp = head;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode left_side = sortList(head);
        ListNode right_side = sortList(slow);
        return merge(left_side, right_side);
    }

    public static void main(String[] args){
    
}
