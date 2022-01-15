public class Loop01 {
    public static void main(String[] args) {
        // for(1,2,3) : (1 = 초기화 변수 , 2 = 조건 변수 , 3 = 조건이 true일 때 실행 변수){}
        // ()안의 조건이 true이면 {}코드블럭을 실행함
        int sum = 0;
        for (int i = 0 ; i  < 10; i++){
            sum += i; //sum객체에 i를 할당과 동시에 더해줌
        }
        System.out.println(sum);

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int sum1 = 0;
        for (int i=0 ; i <array.length; i++){
            sum1 += array[i];
        }
        System.out.println(sum1);
    }
}
