public class SingleLinkedList<E>{

    private static class Node<E>{
        private E data;
        private Node<E> next;
        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public SingleLinkedList(){
        head = null;
        size = 0;
    }


    public void add(int index, E element){
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        if(index == 0){
            addFirst(element);
        }
        else {
            Node<E> node = getNode(index-1);

        }
        Node<E> current = head;
    }

    private Node<E> getNode(int index){
        Node<E> node = head;
        while(node.next!=null){
            node = node.next;
        }
        return node;

    }
    public void addFirst(E element){
        head = new Node<>(element, head);
        size++;
    }



}