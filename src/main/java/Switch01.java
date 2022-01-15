public class Switch01 {
    public static void main(String[] args) {
        char rank = 'B';
        //switch , case 조건 : switch() 괄호 안의 객체가 아래 case조건에 부합할 때 case: 다음 코드블럭이 실행됨
        //                    break를 넣지 않으면 다음 블럭이 실행됨 , case조건에 부합하지 않으면 default블럭이 실행
        switch (rank){
            case 'A':
                System.out.println("Is perpect");
                break;
            case 'B':
                System.out.println("Is soso");
                break;
            case 'C':
                System.out.println("Is bad");
                break;
            default:
                System.out.println("Bad ass");
        }
    }
}
