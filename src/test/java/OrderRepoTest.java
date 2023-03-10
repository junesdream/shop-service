import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void testAddAndGetOrder() {
        // GIVEN
        Order order = new Order("Or01", new ArrayList<>(), OrderStatus.NEW, LocalDateTime.now());
        OrderRepo orderRepo = new OrderRepo(new HashMap<>());

        // WHEN
        orderRepo.add(order);
        Order retrievedOrder = orderRepo.get(order.getId());

        // THEN
        assertEquals(order, retrievedOrder);
    }

}
