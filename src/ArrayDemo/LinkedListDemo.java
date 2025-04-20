
public class LinkedListDemo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    };

    static Node head = null;
    static Node tail = null;

    static void addNode(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;

        } else {
            node.next = head;
            head = node;
        }

    }

    static void printNode() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "----->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    static boolean seartInList(int value){

        if(head== null){
            return false;

        }
        Node temp = head;
        while(temp!=null){
            if(temp.data== value){
                return true;
            }
            temp = temp.next;
        }

        return false;

    }

    public static void main(String[] args) {

        addNode(5);
        addNode(5);
        addNode(3);
        addNode(2);



        printNode();

        boolean reuslt = seartInList(6);
        System.out.println(reuslt);

    }

}
