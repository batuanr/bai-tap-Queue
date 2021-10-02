

public class Main {
    public static void main(String[] args) throws Exception {

        MyQueue<Integer> num = new MyQueue<>();
        num.enqueue(1);
        num.enqueue(2);
        num.enqueue(3);
        num.enqueue(4);
        System.out.println(num);
        num.dequeue();
        num.enqueue(5);
        System.out.println(num);

    }
}
