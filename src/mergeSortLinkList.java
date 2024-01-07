public class mergeSortLinkList {
    public class ListNode
    {
        int val;
        ListNode next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode temp = new ListNode();
        ListNode tail = temp;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
                tail=tail.next;
            }
            else
            {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1!=null)?list1:list2;
        return temp.next;
    }
    public ListNode getMid(ListNode head)
    {
        ListNode temp = null;
        while(head!=null && head.next!=null)
        {
            temp = (temp==null)?head:temp.next;
            head = head.next.next;
        }
        ListNode mid = temp.next;
        temp.next = null;
        return mid;
    }
}
