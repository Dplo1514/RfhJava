class Animal {
    String name;

    public void cry() {
        System.out.println(name + "is cry");
    }
}

class Dog extends Animal{
    Dog(String name){
        this.name = name;
    }
    public void swim(){
        System.out.println(name + "is swim");
    }
}

public class child {
    public static void main(String[] args) {
        Dog dog = new Dog("ppoppi");
        dog.cry();
        dog.swim();

        Animal dog2 = new Dog("cream");
        dog2.cry();
//        dog2.swim();
    }
}
