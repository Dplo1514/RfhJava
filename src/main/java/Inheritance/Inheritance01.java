package Inheritance;

class Animal { //부모 class Animal은 String type의 name 멤버 변수를 가집니다.
    String name;

    public void cry() {
        System.out.println(name + " is cry");
    }
}

class dog extends Animal { //부모 타입 Animal을 extends (상속)받는 자식 class
    dog(String name){ //부모타입의 멤버변수를 생성자 초기화
        this.name = name;
    }

    public void swim(){
        System.out.println(name + " is Swimming");
    }
}


public class Inheritance01 {
    public static void main(String[] args) {
        dog Dog = new dog("BOOBBI"); //자식 타입 class의 인스턴스
        Dog.cry();
        Dog.swim();

        Animal dog2 = new dog("Cream"); //변수 타입 = 부모 class , 인스턴스 = 자식 class
                                        //변수의 타입이 부모 클래스이기 때문에 실질적으로 부모 class의 메서드만 사용이 가능 dog.swim()X
        dog2.cry();
    }
}
