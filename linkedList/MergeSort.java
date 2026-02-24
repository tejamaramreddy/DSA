package linkedList;
class ListNode{
    int data;
    ListNode next;
    ListNode(){

    }
    ListNode(int data){
        this.data = data;
    }
    ListNode (int data, ListNode next){
        this.data = data;
        this.next = next;
    }
}
public class MergeSort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);

    }

    public  ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    public ListNode merge(ListNode list1,  ListNode list2){
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null){
            if (list1.data < list2.data){
                current.next = list1;
                list1 = list1.next;
                current = current.next;
            }else  {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        if (list1 == null){
            current.next = list2;
        }else  {
            current.next = list1;
        }
        return head.next;
    }
}
