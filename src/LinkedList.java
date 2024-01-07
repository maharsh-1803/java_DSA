import java.util.List;

public class LinkedList {
    private Node head ;
    private Node tail;
    private int size=0;
    public LinkedList()
    {
        this.size = 0;
    }
    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }
    public void deleteFirst()
    {
        if(head==null)
        {
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast()
    {
        if(size<=1)
        {
            deleteFirst();
        }
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next  = null;
        size--;
    }
    public Node get(int index)
    {
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;

    }
    public void insertAtIndex(int value,int index)
    {
        if(size==0)
        {
            insertFirst(value);
            return;
        }
        if(size==index)
        {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i <index-1 ; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public void deleteAtIndex(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        if(index==size-1)
        {
            deleteLast();
        }
        Node first = get(size-index-1);
        Node second = get(size-index);
        first.next = second.next;
        size--;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void CycleMethod()
    {
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast==null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast ==slow)
            {
//                return true; cycle is present in linkList
            }
        }
//        return false; cycle is not present in linkList
    }
    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value , Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
