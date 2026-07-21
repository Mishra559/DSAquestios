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
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode result = new ListNode(-1);
        ListNode tail = result;

        ListNode current = head;

        while (current != null) {

            tail.next = new ListNode(current.val);
             tail = tail.next;

            if(current.next != null){
                int x = gcd(current.val, current.next.val);
                tail.next = new ListNode(x);
            }

            tail = tail.next;

            

            current = current.next;

        }

        return result.next;

    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}