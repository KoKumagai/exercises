/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode reversedList = null;

        while (head != null) {

            ListNode next = head.next;
            head.next = reversedList;
            reversedList = head;
            head = next;

        }

        return reversedList;

    }

}
