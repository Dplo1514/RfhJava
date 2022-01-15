package ObjectConcept;

public class Method01 {
    public static void main(String[] args) {
    }

    int add(int x , int y){ //int : 함수(메서드)의 결과값이 return될 때의 data type ,
                            //add() : 메서드의 이름 (type parameter , type parameter2)
        int result = x+y;
        return result;
    }

    int minus(int x , int y){ //또다른 메서드에서 상위 메서드와 같은 파라미터 , 변수를 선언해도 전혀 연관이 없이 메서드 독립적으로 취급됨
        int result = x+y;
        return result;
    }

}
