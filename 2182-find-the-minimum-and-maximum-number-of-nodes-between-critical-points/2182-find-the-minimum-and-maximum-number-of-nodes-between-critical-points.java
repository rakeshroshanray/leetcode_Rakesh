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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        int ans [] = new int[2];
        int max = 0;
        int min = 100000;
        int temp = -1;
        int count = 1;
        while(next != null){
            if((cur.val > prev.val && cur.val > next.val) || (cur.val < prev.val && cur.val < next.val) ){
                
                if(temp != -1){
                    if(count - temp < min){
                        min = count -temp;
                    }
                    max += count - temp;
                }
                temp = count;
            }
            count++;
            prev = cur;
            cur = next;
            next = next.next;

        }
        if(min == 100000 || max == 0){
             ans[0] = -1;
             ans[1] =  -1;
        }
        else{
            ans[0] = min;
            ans[1] = max;
        }
        return ans;
    }
    
}