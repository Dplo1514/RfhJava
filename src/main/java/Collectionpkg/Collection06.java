package Collectionpkg;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Collection06 {
    public static void main(String[] args) {
        //ArrayDeque : 양쪽에서 파라미터의 추가 , 추출이 가능함
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4); //파라미터를 앞에 추가
        System.out.println(arrayDeque);

        arrayDeque.addLast(0); //파라미터를 뒤에 추가
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);

        arrayDeque.offerLast(-1);
        System.out.println(arrayDeque);

        arrayDeque.push(22);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);
    }
}
