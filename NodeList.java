package algorithm;

/**
 * Created by Linnq on 2017/9/4.
 */
public class NodeList {
    Node head; //头结点
    Node current; //当前节点

    public void add(int data) {
        if (null == head) { //链表还没创建
            head = new Node(data);
            current = head;
        } else { //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
            current.next = new Node(data);
            current = current.next;
        }
    }

    public void print(Node node) {
        if (null == node) {
            System.out.println("");
        }
        while (null != node) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String args[]) {
        NodeList list = new NodeList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.print(list.head);
    }
}

class Node {
    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
    }
}
