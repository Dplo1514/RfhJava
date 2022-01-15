package QuizFamily;


public class Main {


    public static void main(String[] args) {
        //모든 사람의 정보를 한번씩 출력합니다.
        Child plo = new Child();
        plo.information("Plo" , 25 , 5 , 0 , 0);

        Parents jinmi = new Parents();
        jinmi.information("Jinmi" , 44 , 3 , 0 , 0);

        Human jongsung = new Human();
        jongsung.information("jongsung" , 80 , 1 , 0 ,0 );

        //걸을 수 있는 모든 사람이 1,1 만큼 걷습니다.
        plo.walk(1,1);
        jinmi.walk(1,1);
        jongsung.walk(1,1);

        //뛸 수 있는 모든 사람 2,2 만큼 달립니다.
        plo.run(2,2);
        jinmi.run(2,2);

        //수영할 수 있는 모든 사람은 3,1 위치로 수영합니다
        plo.swim(-2,-6);
    }

}


