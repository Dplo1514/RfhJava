package QuizFamily01;

public class GrandParents extends People implements Walkable{
    public GrandParents(String name, int age) {
        super(name, age, 1);
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
