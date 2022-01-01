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

public class stream3 {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("Appple" , 5000 , 0.05f),
                new Sale("Banana" , 8000 , 10),
                new Sale("kiwi" , 10000 , 5)
        );

        sales.stream()
                .map(sale -> Pair.of(sale.fruitName , sale.price * (1-sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실가격은 " + pair.getRight() + " 원 입니다. "));

    }
}