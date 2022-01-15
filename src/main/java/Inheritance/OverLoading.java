package Inheritance;

public class OverLoading {
    // 메서드의 이름과 매개변수 타입이 같지만 , 메서드의 타입만 다른 경우 오버로딩이 아님
    int add(int x ,int y , int z){
        return x+y+z;
    }

    int add(int a ,int b ){ //메서드의 데이터 타입과 이름은 같지만 매개변수가 다른 경우
        return a + b ;
    }

    long add(int a ,int b , long c){ //메서드의 이름은 같지만 메서드의 타입과 매개변수의 타입이 다른 경우
        return a+b+c;
    }



    public static void main(String[] args) {

    }
}
