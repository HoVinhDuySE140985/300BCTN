package bt3;

public class ListNode {
    
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode mergeTwoLists(ListNode list1 , ListNode list2){
        ListNode result = new ListNode(-1);
        ListNode p = result;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 == null){
            p.next = list2;
        }else if(list2 == null){
            p.next = list1;
        }
        return result.next;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode( );
        // head1.next = new ListNode(2);
        // head1.next.next = new ListNode(4);
 
        // 1->3->5 LinkedList created
        ListNode head2 = new ListNode(0);
        // head2.next = new ListNode(3);
        // head2.next.next = new ListNode(4);
 
        // 0->2->4 LinkedList created
        ListNode mergedhead = mergeTwoLists(head1, head2);
 
        while (mergedhead != null) {
            System.out.print(mergedhead.val + " ");
            mergedhead = mergedhead.next;
        }
    }
}
