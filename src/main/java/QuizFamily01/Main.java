package QuizFamily01;


public class Main {
    public static void main(String[] args) {
        People grandParent = new GrandParents("할아버지" , 70);
        People parents = new Parents("아버지" , 45);
        People child = new Children("아들" , 25);

        People[] people = {grandParent , parents , child};
        for(People peoples : people){
            System.out.println("이름 :" + peoples.name + " 나이 :" + peoples.age + "속도 :" +peoples.speed +
                    "현재 위치(" + peoples.getLocation());
        }

        System.out.println("-----활동 시작-----");
        for (People peoples : people){
            if(peoples instanceof Walkable){
                ((Walkable) peoples).work(1,1); //Casting : 객체의 타입과 별개로 Interface를 instance of 로 확인 , casting함으로써 interface type으로 객체를 지정
                System.out.println("----------");
            }if(peoples instanceof Runable){
                ((Runable) peoples).Run(2,2);
                System.out.println("----------");
            }if(peoples instanceof Swimable){
                ((Swimable) peoples).swim(3,-1);
                System.out.println("----------");
            }
        }

    }
}
