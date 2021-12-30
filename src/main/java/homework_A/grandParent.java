package homework_A;

public class grandParent extends Human{
    public grandParent(String name ,int age) {
        super(name, age, 1);
    }

    public void walk(int x ,int y){
        printMe();
        System.out.println("GrandParent Speed:" + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walk do to" + getLocation());;
    }
}