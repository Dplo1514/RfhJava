package QuizFamily01;

public class Children extends People implements Walkable ,Runable ,Swimable {
    public Children(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void work(int x, int y) {
        printWhoAmI();
        System.out.println("Walk speed : " + speed);
        this.x = x;
        this.y = y;

        System.out.println("Walked to" + getLocation());
    }

    @Override
    public void Run(int x, int y) {
        printWhoAmI();
        System.out.println("Run speed : " + (speed + 2));
        this.x = x;
        this.y = y;

        System.out.println("Run to" + getLocation());
    }

    @Override
    public void swim(int x, int y) {
            printWhoAmI();
            System.out.println("Swim speed : " + (speed + 1));
            this.x = x;
            this.y = y;

            System.out.println("Swimming to" + getLocation());
        }
    }

