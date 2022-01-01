import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(0);
        integerStack.push(3);
        integerStack.push(7);
        integerStack.push(5);
        integerStack.push(2);
        integerStack.push(1);

        System.out.println(integerStack);

        System.out.println(integerStack.peek()); //맨 위 확인만
        System.out.println("size" + integerStack.size());
        System.out.println(integerStack.pop()); //맨 위 꺼냄
        System.out.println("size" + integerStack.size());

        System.out.println(integerStack.contains(1));
        System.out.println(integerStack.empty());
        integerStack.clear();
        System.out.println(integerStack.isEmpty());

    }
}
