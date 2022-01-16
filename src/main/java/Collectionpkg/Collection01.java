package Collectionpkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection01 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>(); //List는 크기를 정의해주지 않아도 add해주는대로 크기가 맞춰짐 , 자동정렬 x , 중복이 허용
        i.add(1);
        i.add(5);
        i.add(3);
        i.add(8);
        i.add(7);
        i.add(10);
        System.out.println(i);

        Collections.sort(i); //Collections의 sort를 호출하여 리스트 i를 오름차순 정렬해줌

        System.out.println(i);
        System.out.println(i.size()); //length 대신 size를 사용하여 인덱스 크기를 출력
        i.remove(4); //4번째 파라미터를 인덱스해서 삭제
        System.out.println(i);

        for (int x = 0 ; x < i.size() -1 ; x++){
            System.out.println(i.get(x)); //get()인덱스 함수
        }for (int current : i){
            System.out.println(current);
        }
    }
}
