package ObjectConcept;

class Caculation { //Caculation이란 클래스의 멤버변수는 add , subtract입니다.

    int add (int x , int y){ //add함수(메서드)는 x와 y를 더한 값을 반환해줍니다.
        return x + y;
    }

    int subtract (int x , int y){ //subtract함수(메서드)는 x에서 y를 뺀 값을 반환해줍니다.
        return x - y;
    }
}

public class Method02 {
    public static void main(String[] args) {
        Caculation caculation = new Caculation(); //caculation은 Caculation이란 클래스로부터 만들어진 객체(인스턴스)
        int addResult = caculation.add(1,2); //caculation 클래스의 멤버변수인 메서드 add를 호출하여 사용합니다
        int subtractResult = caculation.subtract(5,3); //caculation 클래스의 멤버변수인 메서드 add를 호출하여 사용합니다

        System.out.println(addResult);
        System.out.println(subtractResult);
    }
}
