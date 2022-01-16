package QuizFamily;

import javax.swing.event.HyperlinkEvent;

public class Human {
    String name;
    int age;
    int speed;
    int x;
    int y;

     public void information(String name, int age, int speed ,int x ,int y) { //사람별 정보를 정해줄 메서드
         this.name = name;
         this.age = age;
         this.speed = speed;
         this.x = x;
         this.y = y;

         System.out.println("이름:" + name + " 나이:" + age + " 속도:" + speed + " 현재위치:["+ x + "," + y + "]");
     }


    public void walk(int x, int y) { //걸어가는 메서드
        this.x = x;
        this.y = y;
        x = speed + 1;
        y = speed + 1;
        printLocation();
        System.out.println(name +" 걸어갑니다{" + x + "," + y + "}");
    }

     public void printLocation() {
        System.out.println("이동합니다.");
    }
}

class Parents extends Human {

    public void run(int x, int y) { //달려가는 메서드
        this.x = x;
        this.y = y;
        x = speed + 2;
        y = speed + 2;
        printLocation();
        System.out.println(name + " 달려갑니다. {" + x + "," + y + "}");
    }
}

class Child extends Human {
    public void run(int x, int y) { //달려가는 메서드
        this.x = x;
        this.y = y;
        x = speed + 2;
        y = speed + 2;
        printLocation();
        System.out.println(name +" 달려갑니다. {" + x + "," + y + "}");
    }

    public void swim(int x, int y) { //수영하는 메서드
        this.x = x;
        this.y = y;
        x = speed + x;
        y = speed + y;
        printLocation();
        System.out.println(name + " 수영합니다. {" + x + "," + y + "}");
    }
}











