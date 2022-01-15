package Modifier.ModifierTest; //다른 패키지를 참조할 때에는드항상 import가 따름

import Modifier.Modifier01;

class Child extends Modifier01 { //Modifier01 클래스를 상속받는 child 클래스
    void callParentProtected() {
        System.out.println("call my parent protected method");
        super.messageProtected(); //super : 내가 상속받은 부모 클래스를 가르키는 keyword , messageProtected 클래스를 상속받음
    }
}

public class ModifierTest {
    public static void main(String[] args) {
        Modifier01 modifier01 = new Modifier01();
        modifier01.messageOutside(); //public class인 messageOutside함수 호출
//        modifier01.messageInside(); //접근제어자가 private이기 때문에 다른 클래스에서는 호출이 불가능
//        modifier01.messagePkgPrivate(); //접근제어자가 default(nothing)없는 클래스이기 때문에 다른 패키지에서는 호출이 불가능

        Child child = new Child();
        child.callParentProtected(); //접근제어자가 protected이나 child 클래스가 Modifier01의 자식 클래스이기 때문에 메서드 호출이 가능
    }


}
