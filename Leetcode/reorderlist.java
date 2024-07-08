public class reorderlist {
    
}
 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     class Solution {
        public void reorderList(ListNode head) {


            if(head==null || head.next == null) return ;
            ListNode slow = head;
            ListNode fast = head;
            

            
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
/// reverse the list after finding the middle of the list. reverse the list from node after mid
            }
            ListNode reverse = reverseList(slow.next);
            slow.next = null;

            merge(head, reverse);


        }
    
        public ListNode reverseList(ListNode start){
            ListNode prev = null;
            ListNode cur = start;
            ListNode next = null;

            while(cur!=null){
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;

            }
            start = prev; // or return prev is fine too here
            return start;

        }
        public void merge(ListNode l1, ListNode l2){
            while(l1!=null && l2!=null){
                ListNode l1next = l1.next;
                ListNode l2next = l2.next;

                l1.next = l2;
                if(l1next==null){
                    break;
                }
                l2.next = l1next;
                l1 = l1next;
                l2 = l2next;

            }
        }
    }