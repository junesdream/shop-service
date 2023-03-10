import java.util.Map;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    //Methode, welche ein Produkt mit einer vorgegebenen ID aufruft
    public Product getProduct(String id) {
        return productRepo.get(id);
    }

    //Methode, welche die gesamte Liste von Produkt aufruft
    public Map<String, Product> listProducts(){
        return productRepo.list();
    }

    //Methode, welche ein Order mit einer vorgegebenen ID aufruft
    public Order getOrder(String id) {
        return orderRepo.get(id);
    }
    //Methode, welche die gesamte Liste von Order aufruft
    public Map<String, Order> listOrders(){
        return orderRepo.list();
    }

    //Methode fügt eine Order der Liste hinzu
    public void addOrder(Order order){
        orderRepo.add(order);
    }
}
