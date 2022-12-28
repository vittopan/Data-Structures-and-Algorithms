package Lists;

public class DLL {
    class Node {
        public int data;
        public Node next;
        public Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    int counter = 0;
    Node headNode, tailNode = null;

    public void addNode(int data) {
        Node temp = new Node(data);
        if (headNode == null) {
            headNode = tailNode = temp;
            headNode.prev = null;
            tailNode.next = null;
        } else {
            tailNode.next = temp;
            temp.prev = tailNode;
            temp.next = null;
            tailNode = temp;
        }
        counter++;
    }

    public void printNode() {
        Node current = headNode;
        if (headNode == null) {
            System.out.println("Empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int getSize() {
        return counter;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public static void main(String[] args) {
        DLL d = new DLL();
        d.addNode(10);
        d.addNode(13);
        d.addNode(19);
        d.addNode(21);
        d.printNode();
    }
}
