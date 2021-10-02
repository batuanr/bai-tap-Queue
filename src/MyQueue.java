public class MyQueue<E> {
    private MyLinkedList<E> arr;

    public MyQueue() {
        arr = new MyLinkedList<>();
    }
    public boolean isQueueEmpty(){
        if(arr.getSize() == 0){
            return true;
        }
        return false;
    }

    public MyLinkedList<E> getArr() {
        return arr;
    }

    public void enqueue(E data){
        arr.addLast(data);
    }
    public E dequeue() throws Exception{
        if (isQueueEmpty()){
            throw new UnsupportedOperationException("mảng rỗng");
        }
        return arr.removeFist();
    }
    public String toString(){
        return arr.toString();
    }


}
