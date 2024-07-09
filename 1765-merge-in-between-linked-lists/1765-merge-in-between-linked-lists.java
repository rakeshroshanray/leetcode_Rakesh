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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;
        ListNode second = list1;
        int count = 1;
        while(count != b+1){
            if(count < a){
                first = first.next;
            }
            if( count != b+1){
                second = second.next;
            }
            count++;
        }
        first.next = list2;
        while(first.next != null){
            first = first.next;
        }
        first.next = second.next;
        return list1;
    }
    
}