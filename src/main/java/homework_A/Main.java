package homework_A;

public class Main {
    public static void main(String[] args) {
        Human grandParent = new grandParent("malsook" , 80);
        Human children = new child("hyuk" , 24);
        Human parents = new parent("jinmi" , 42);

        Human[] humans = {grandParent , children , parents};

        for (Human human : humans) {
            System.out.println(human.name + "나이" + human.age + "속도" + human.speed + human.getLocation());
        }
        System.out.println("시작");
        for (Human human : humans) {
            if (human instanceof walk){
                ((walk)human).walk(1,1);
                System.out.println("\n");
            }

            if (human instanceof run){
                ((run)human).run(2,2);
                System.out.println("\n");
            }

            if (human instanceof swim){
                ((swim)human).swim(3,-1);
                System.out.println("\n");
            }
        }
    }
}
