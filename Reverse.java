package algorithm;

/**
 * Created by Linnq on 2017/9/4.
 */
public class Reverse {
    protected static void reverse(Node head, int from, int to) {
        if (head == null) {
            return;
        }
        Node p = head.next;
        int i = 0;
        for (; i < from - 1; i++) {
            head = p;
            p = p.next;
        }
//        Node per = p;
//        p = p.next;
        head.next = null;
        Node temp = null;
        for (; i < to; i++) {
            temp = p.next;
            p.next = head.next;
            head.next = p;
            p = temp;
        }

    }

    public static void main(String args[]) {
        NodeList list = new NodeList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        reverse(list.head, 2, 6);
        list.print(list.head);
    }
}
