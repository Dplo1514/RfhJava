package pkg;

public class Modifier {
    private void messageInside(){ //private 같은 패키지내에서만 호출 가능
        System.out.println("This is message private modifier");
    }

    public void messageOutside(){
        System.out.println("This is message public modifier");
        messageInside();
    }

    protected void messageProtected(){
        System.out.println("This is protected modifier");
    }

    void messagePkgPrivate() {
        System.out.println("This Pkg private modifier");
    }
}
