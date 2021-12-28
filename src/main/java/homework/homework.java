package homework;
import java.sql.Struct;

class humanData {
    String name;
    int age;
    int speeds;
    int x, y;

    void humanData(String name, int age, int speeds, int x, int y) {
        this.name = name;
        this.age = age;
        this.speeds = speeds;
        this.x = x;
        this.y = y;
    }

    public void dataPrint(){
        System.out.println("이름:" + name + "나이:" + age);
    }

}// 모든 사람의 이름 , 나이를 입력할 set

//method move
abstract class move {

    private int x,y;

    void work(int x ,int y) {
        printLocation();
        System.out.println("걸어갑니다.");
        this.x = x;
        this.y = y;
        printLocation();
    }

    void run(int x ,int y) {
        printLocation();
        System.out.println("뛰어갑니다!!");
        this.x = x + 2;
        this.y = y + 2;
        if (run(x)){
            printLocation();
        }else {
            System.out.println("달릴 수 없습니다.");
        }
    }

    void swim(int x ,int y) {
        printLocation();
        System.out.println("수영합니다 !!!!");
        this.x = x + 1;
        this.y = y + 1;
        if (run(x)){
            printLocation();
        }else {
            System.out.println("수영할 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean run(int x);
    abstract boolean swim(int x);


    public void printLocation(){
        System.out.println("현재 위치 {" + x + "," + y + "}");
    }
}


//grandma move boolean
class grandMaMove extends move {

    @Override
    boolean run(int x) {
        return false;
    }

    @Override
    boolean swim(int x) {
        return false;
    }
}

//parent move boolean
class parentsMove extends move {

    @Override
    boolean run(int x) {
        return true;
    }

    @Override
    boolean swim(int x) {
        return false;
    }
}


//child move boolean
class childMove extends move {


    @Override
    boolean run(int x) {
        return true;
    }

    @Override
    boolean swim(int x) {
        return true;
    }
}


public class homework {
    public static void main(String[] args) {
        //할머니 개인정보
        humanData grandMaData = new humanData();
        grandMaData.humanData("malsook" , 80 , 1 , 0 , 0);
        grandMaData.dataPrint();

        //할머니 이동
        grandMaMove grandmaMoving = new grandMaMove();
        grandmaMoving.work(1,1);
        System.out.println("\n");


        //아이 개인정보
        humanData childData = new humanData();
        childData.humanData("hyuk" , 24 , 5 , 0 , 0);
        childData.dataPrint();

        //아이 이동
        childMove childMoving = new childMove();
        childMoving.swim(1,1);
        System.out.println("\n");

        //부모 개인정보
        humanData parentData = new humanData();
        parentData.humanData("hyunsoo" , 50 , 3 , 0 , 0);
        parentData.dataPrint();

        parentsMove parentsMoving = new parentsMove();
        parentsMoving.work(1,1);
        parentsMoving.run(1,1);
        parentsMoving.swim(1,1);
        System.out.println("\n");

    }
}

