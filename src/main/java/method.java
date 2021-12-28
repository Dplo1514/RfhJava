class Caculation {
    int add(int x , int y){
        return x + y;
    }

    int subtract(int x , int y){
        return x - y ;
    }
}

public class method {
    public static void main(String[] args) {
        Caculation caculation = new Caculation();
        int addresult = caculation.add(1,2);
        int subreact = caculation.subtract(2,1);

        System.out.println(addresult);
        System.out.println(subreact);

    }
}