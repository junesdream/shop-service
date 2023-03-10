import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {
        @Test
        void returnsAllProducts() {
             //GIVEN
             Product product1 = new Product("B10", "Becher");
             Product product2 = new Product("C20", "Glass");

             Map<String, Product> productTestMap = new HashMap<>();
             productTestMap.put(product1.getId(), product1);
             productTestMap.put(product2.getId(), product2);
             ProductRepo productRepo1 = new ProductRepo(productTestMap);

             //WHEN
            Map<String, Product> actual  = productRepo1.list();

            //THEN
            assertEquals(productTestMap, actual);
        }

        @Test
        void returnsNotAllProducts() {
            //GIVEN
            //Product product1 = new Product("B10", "Becher");
            //Product product2 = new Product("C20", "Glass");


            Map<String, Product> productTestMap = new HashMap<>();
            //productTestMap.put(product1.getId(), product1);
            //productTestMap.put(product2.getId(), product2);

            ProductRepo productRepo1 = new ProductRepo(productTestMap);

            //WHEN
            Map<String, Product> actual  = productRepo1.list();

            //THEN

            //Product product3 = new Product("C45", "Tasse");
            //productTestMap.put(product3.getId(), product3);
            assertEquals(Collections.emptyMap(), actual);
        }

        @Test
        void getProductTest() {
            //GIVEN
            Product product1 = new Product("B10", "Becher");
            Map<String, Product> productTestMap = new HashMap<>();
            productTestMap.put(product1.getId(), product1);
            ProductRepo productRepo1 = new ProductRepo(productTestMap);

            //WHEN
            Product actual = productRepo1.get("B10");

            //THEN
            assertEquals(product1, actual);
        }

    @Test
    void getNotProductTest() {
        //GIVEN
        Product product1 = new Product("B10", "Becher");
        Map<String, Product> productTestMap = new HashMap<>();
        productTestMap.put(product1.getId(), product1);
        ProductRepo productRepo1 = new ProductRepo(productTestMap);

        //WHEN
        Product actual = productRepo1.get("B11");

        //THEN
        assertNull(actual);
    }
}