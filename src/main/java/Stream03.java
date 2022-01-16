import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}

public class Stream03 {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("Apple", 5000, 0.5f),
                new Sale("Banana", 8000, 0.9f),
                new Sale("kiwi", 3000, 9.5f)
        );

        sales.stream()
                .map(sale -> Pair.of(sale.fruitName , sale.price * (1 - sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + "의 실구매가는" + pair.getRight() + "원 입니다."));
    }
}
