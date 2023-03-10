import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
    // Map, um die ID als Key benutzen zu können
    private Map<String, Product> productMap;

    public ProductRepo(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public Map<String, Product> list() {
        return productMap;
    }
    public Product get(String id) {
        return productMap.get(id);
    }


}
