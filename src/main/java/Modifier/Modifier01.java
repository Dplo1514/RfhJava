package Modifier; //package 경로

public class Modifier01 {
    private void messageInside(){ //같은 클래스에서만 접근이 가능한 메서드
        System.out.println("This is private modifier");
    }

    public void messageOutside() { //모든 클래스에서 접근이 가능한 메서드
        System.out.println("This is public modifier");
        messageInside();
    }

    protected void messageProtected() { //같은 패키지 , 다른 패키지의 자식 클래스에서만 접근이 가능한 메서드

        System.out.println("This is protected modifier");
    }

    void messagePkgPrivate() { //default : 같은 패키지 내에서만 접근이 가능한 메서드
        System.out.println("this is pkg modifier");
    }
}
