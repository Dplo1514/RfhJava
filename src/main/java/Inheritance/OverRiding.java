package Inheritance;

class Cat {
    String catname;
    String color;

    public Cat(String catname, String color) {
        this.catname = catname;
        this.color = color;
    }

    public void crying(){
        System.out.println(catname + "miyao");
    }
}

class terkeysh extends Cat {
    public terkeysh(String catname, String color) {
        super(catname, color);
    }

    @Override //부모 클래스의 함수를 자식 클래스가 똑같이 선언 후 다른 기능을 할당 , 덮어버림
    public void crying(){
        System.out.println(catname + "grrrrrrrr");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Cat yumi = new terkeysh("yumi" , "black"); //자식 클래스의 메서드가 적용됨
        yumi.crying();
    }
}
