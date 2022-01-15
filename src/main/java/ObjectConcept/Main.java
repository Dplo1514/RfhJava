package ObjectConcept;

class Phone {
    String model;
    String color;
    int price;
} //Phone이란 class는 model , color , price라는 속성(멤버 변수)을 가집니다.

public class Main {
    public static void main(String[] args) {
        Phone galaxy = new Phone(); //Phone galaxy : Phone Class로 부터 만들어 객체(인스턴스)
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone =new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Black";
        iphone.price = 200;


        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}