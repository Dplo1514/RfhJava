package Collectionpkg;

import java.util.LinkedList;
import java.util.Queue;

public class Collection05 {
    public static void main(String[] args) {
        //큐 : FIFO 제일 처음 넣은 파라미터가 제일 먼저 꺼내짐
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(3);
        integerQueue.add(2);
        integerQueue.add(8);

        System.out.println(integerQueue);
        System.out.println(integerQueue.poll()); //큐 내부의 제일 처음 add한 파라미터를 꺼낸다.
        System.out.println(integerQueue);
    }
}
