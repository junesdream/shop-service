import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void addNewOrder() {
        //GIVEN
        Map<String, Order> orderTestMap = new HashMap<>();
        Order order1 = new Order("Or01", List.of(
                new Product("B10", "Becher")
        ));
        OrderRepo orderRepo1 = new OrderRepo(orderTestMap);
        //WHEN
        orderRepo1.add(order1);
        Map<String, Order> actual = orderTestMap;
        Map<String, Order> expectedMap = new HashMap<>(Map.of("Or01", order1));

        //THEN
        assertEquals(expectedMap, actual);

    }

    @Test
    void addNewOrderFail() {
        //GIVEN
        Map<String, Order> orderTestMap = new HashMap<>();
        Order order1 = new Order("Or01", List.of(
                 new Product("B10", "Becher")
        ));
        OrderRepo orderRepo1 = new OrderRepo(orderTestMap);
        //WHEN
        orderRepo1.add(order1);
        Map<String, Order> actual = orderTestMap;
        Map<String, Order> expectedMap = new HashMap<>(Map.of("Or02", order1));

        //THEN
        assertNotEquals(expectedMap, actual);

    }

}