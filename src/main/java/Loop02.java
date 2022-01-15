public class Loop02 {
    public static void main(String[] args) {
        //for each문 for(변수 선언 : 배열) : 괄호 앞의 선언한 변수에 뒤의 배열을 하나씩 집어넣으며 {}코드 블럭을 실행
        String[] days = new String[]{"1","2","3","4","5","6","7"};

        for (String day : days){
            System.out.println(day);
        }
    }
}
