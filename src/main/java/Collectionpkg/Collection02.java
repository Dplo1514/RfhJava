package Collectionpkg;

import java.util.*;

public class Collection02 {
    public static void main(String[] args) { //Set은 중복을 허용하지 않고 , 자동정렬이 가능하다.
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(7);
        integerSet.add(5);
        integerSet.add(9);
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("서울");
        stringSet.add("울산");
        stringSet.add("부산");
        stringSet.add("대구");
        stringSet.add("판교");

        System.out.println(stringSet);
        stringSet.remove("서울");
        System.out.println(stringSet);

        List<String> target = new ArrayList<>();
        target.add("울산");
        target.add("부산");

        stringSet.removeAll(target); //removeAll() : 괄호안에 컬렉션타입이 들어가야함
        System.out.println(stringSet);

        System.out.println("LA가 포함되어 있나요??");
        System.out.println(stringSet.contains("부산")); //contains 자료구조 내부에 파라미터가 있는지 확인하는 함수
        System.out.println(stringSet.contains("대구"));

    }
}
