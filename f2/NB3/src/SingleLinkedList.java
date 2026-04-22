public class SingleLinkedList {
    private static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
        void test(){
            System.out.println(size);
        }
    }

    private Node head;
    public int size = 10;

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;

        }
    }

    public void print(){
        Node current = head;
        while(current.next != null){
            System.out.println(current.value + ", ");
            current = current.next;
        }
    }

}

