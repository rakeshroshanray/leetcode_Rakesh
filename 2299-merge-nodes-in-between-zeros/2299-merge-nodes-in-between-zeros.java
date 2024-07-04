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
    public ListNode mergeNodes(ListNode head) {
        ListNode newList = head;
        ListNode newHead = newList;
        int sum = 0;
        ListNode cur = head.next;

        while (cur != null){
            if(cur.val == 0){
                newList.val = sum;
                sum = 0;

                if(cur.next != null){
                    newList = newList.next;;
                }
            }  
            else{
                sum += cur.val;
            }
            cur = cur.next;  
        }
        newList.next = null;
        return newHead;
    }
}