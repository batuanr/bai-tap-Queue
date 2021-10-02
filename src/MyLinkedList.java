import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    class Node {
        private Node next;
        private E data;

        public Node() {
        }

        public Node(E data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }
    public void addLast(E data){
        if (size == 0){
            tail = head = new Node(data);
            size++;
        }
        else{
            tail.next = new Node(data);
            tail = tail.next;
            size++;
        }
    }
    public E removeFist(){
        E temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

    public int getSize() {
        return size;
    }
    public String toString(){
        if (size == 0){
            return "[]";
        }
        else{
            Object[] newStr = new Object[size];
            Node temp = head;
            newStr[0] = temp.data;
            for (int i = 0; i < size -1; i++) {
                temp = temp.next;
                newStr[i+1] = temp.data;
            }
            return Arrays.toString(newStr);
        }
    }
}
