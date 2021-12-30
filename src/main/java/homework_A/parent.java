package homework_A;

public class parent extends Human implements walk, run {
    public parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void run(int x, int y) {
            printMe();
            System.out.println("run Speed" + (speed + 2));
            this.x = x;
            this.y = y;
            System.out.println("Walk do to" +getLocation());
    }


    public void walk(int x , int y){
        printMe();
        System.out.println("walk Speed" + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walk do to" +getLocation());
    }


}

