import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product2 = new Product("ABC123", "Feierabendbier");
        Map<String, Product> products = new HashMap<>();
        products.put(product2.getId(), product2);
        System.out.println(products);

        ProductRepo productDB = new ProductRepo(products);
        productDB.get("ABC123");
        System.out.println(productDB.list());

        //Order myOrder = new Order("1", Map<>);
    }
}
