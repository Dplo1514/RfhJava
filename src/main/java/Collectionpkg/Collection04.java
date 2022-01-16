package Collectionpkg;

import java.util.Stack;

public class Collection04 {
    public static void main(String[] args) {
        //스택 : LIFO 마지막에 넣은 파라미터를 제일 먼저 꺼낸다 .push로 넣고 .pop으로 꺼낸다 , 자동정렬 x
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack.peek()); //.peek 마지막에 넣은 파라미터 확인
        System.out.println(integerStack.pop()); // .pop 마지막에 넣은 파라미터 꺼냄
        System.out.println(integerStack);
    }
}
