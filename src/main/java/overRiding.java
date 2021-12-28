class iphone {
    String bell;
    String message;

    public iphone(String bell) {
        this.bell = bell;
    }

    public void call() {
        System.out.println(bell + "ring ring");
    }
}

class iphone11 extends iphone{

    public iphone11(String bell) {
        super(bell);
    }

    @Override
    public void call(){
        System.out.println(bell + "ra ra ra ra");
    }
}



public class overRiding {
    public static void main(String[] args) {
        iphone xs = new iphone11("basicbell");
        xs.call();
    }
}