import java.util.ArrayDeque;
import java.util.Arrays;

public class arrayDeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);
        arrayDeque.offerLast(-1);
        System.out.println(arrayDeque);
        arrayDeque.push(22);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.peek();
        System.out.println(arrayDeque);
    }
}
