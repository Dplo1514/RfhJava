package Constructor;

class Phone {
    String model;
    String color;
    int price;

    Phone(String model, String color, int price) {//생성자의 파라미터는 클래스의 멤버변수와 동일 이름을 사용해도 동일 취급x
        this.model = model; //class의 멤버변수(model)에 파라미터의 값(model)을 할당
        this.color = color;
        this.price = price;
    }//Command + n 후 Constructor 선택으로 생성자의 편리한 생성이 가능
}

public class Constructor01 {
    public static void main(String[] args) {
        Phone galaxy = new Phone("갤럭시10" , "black" , 100);

        Phone iphone =new Phone("아이폰 11" , "white" , 50);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}

