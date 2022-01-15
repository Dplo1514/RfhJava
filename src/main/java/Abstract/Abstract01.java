package Abstract;
abstract class Bird { //추상 메서드의 선언이 가능한 abstract 클래스 생성
    private int x,y,z; //같은 클래스에서만 접근이 가능한 x,y,z 변수 생성
    void fly(int x , int y, int z){
        printLocation();
        System.out.println("이동하겠습니다.");
        this.x = x;
        this.y = y;
        if (flyAble(z)){
            this.z = z;
        }else {
            System.out.println("날 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean flyAble(int z); //설계가 되어있지않은 추상 메서드 생성

    public void printLocation(){
        System.out.println("현재위치 {" + x + y + z + "}");
    }
}

class Pigone extends Bird { //추상 클래스를 상속받기 때문에 추상 클래스가 되거나 , 추상 클래스 내부의 메서드를 호출해야함

    @Override //추상클래스 내부의 메서드를 호출함으로써 추상클래스의 상속이 가능해짐
    boolean flyAble(int z) { //설계가 되어있지 않으나 자식클래스에서 설계함으로써 메서드로의 호출 및 사용이 가능해짐
        return z < 10000;
    }
}

class Peacock extends Bird {
    @Override
    boolean flyAble(int z) {
        return false;
    }
}

public class Abstract01 {
    public static void main(String[] args) {
        Bird pigone = new Pigone();
        Bird peacock = new Peacock();
        System.out.println("-----비둘기-----");
        pigone.fly(1,1,3);
        System.out.println("-----공작새-----");
        peacock.fly(1,1,5);
        System.out.println("-----비둘기-----");
        pigone.fly(3,3,30000);

    }
}
