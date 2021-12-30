package homework_A;

public class child extends Human implements walk, run, swim {
    public child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void run(int x, int y) {
        printMe();
        System.out.println("run Speed" + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("run to do" + getLocation());
    }

    @Override
    public void swim(int x, int y) {
        printMe();
        System.out.println("swim Speed" + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("swim to do" + getLocation());

    }


    @Override
    public void walk(int x, int y) {
        printMe();
        System.out.println("run Speed" + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walk do to" + getLocation());
    }
}
