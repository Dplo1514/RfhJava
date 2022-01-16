package QuizFamily01;

import QuizFamily.Human;

public class Parents extends People implements Walkable,Runable{
    public Parents(String name, int age) {
        super(name, age, 3);
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
    public void work(int x, int y) {
        printWhoAmI();
        System.out.println("Walk speed : " + speed);
        this.x = x;
        this.y = y;

        System.out.println("Walked to" + getLocation());
    }
}
