package Interface;
interface Flyable { //interface클래스 생성
    void fly(int x , int y , int z); // interface 메서드이기 떄문에 코드블럭을 작성하지않음
}

class Pigone implements Flyable { //interface 클래스를 구현(implements) 하는 클래스
    private int x,y,z;
    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("날아갑니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    } //interface 메서드를 구현(implements)

    public void printLocation(){
        System.out.println("현재위치 {" + x + y + z + "}");
    }
}

public class Interface01 {
    public static void main(String[] args) {
        Flyable pigone = new Pigone();
        System.out.println("-----비둘기-----");
        pigone.fly(1,1,3);
    }
}
