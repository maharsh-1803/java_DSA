public class LinkMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(12);
        list.insertFirst(14);
        list.insertLast(15);
        list.insertLast(100);
        list.insertLast(18);
        list.insertAtIndex(120,3);
//        list.deleteFirst();
//        list.deleteLast();
        list.deleteAtIndex(3);
        list.display();
    }
}
