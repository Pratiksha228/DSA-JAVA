package JAVA.LinkedList;

public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add- first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // add -last ---->For these we have traverse the node to last and then we add
    // newnode at the last.

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;

        }
    }

    // print the linked list after adding first and last node to the list

    public void printList() {
        if (head == null) {
            System.out.println("Your list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        head = head.next;

    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("Pratiksha");
        list.addFirst("is");
        list.addFirst("a");
        list.addFirst("Software Engineer");

        list.printList();
        System.out.println();
        list.addLast("Done");
        list.addLast("added");
        System.out.println("After adding two nodes at the end of LL");
        list.printList();

        System.out.println();
        System.out.println("After deleting first node");
        list.deleteFirst();
        list.printList();

        System.out.println();
        System.out.println("After deleting last node");
        list.deleteLast();
        list.printList();

    }

}
