import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
// Erstelle eine Map mit Produkten
        Map<String, Product> productMap = new HashMap<>();


        // Füge 5 Produkte hinzu
        productMap.put("1", new Product("1", "Lego"));
        productMap.put("2", new Product("2", "Barbie-Puppe"));
        productMap.put("3", new Product("3", "Furby"));
        productMap.put("4", new Product("4", "Monopoly"));
        productMap.put("5", new Product("5", "Playmobil"));

        // Erstelle einen Produkt-Repository
        ProductRepo productRepo = new ProductRepo(productMap);

        // Erstelle eine Liste mit Produkten
        List<Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(productRepo.get("1"));
        orderedProducts.add(productRepo.get("2"));
        orderedProducts.add(productRepo.get("3"));

        // Erstelle eine Bestellung
        Order order = new Order("123", orderedProducts, OrderStatus.PROCESSING, LocalDateTime.now());

        // Erstelle eine Map mit Bestellungen
        Map<String, Order> orderMap = new HashMap<>();
        orderMap.put(order.getId(), order);

        // Erstelle ein Bestellungs-Repository
        OrderRepo orderRepo = new OrderRepo(orderMap);

        // Ausgabe der Bestellungsinformationen
        System.out.println("Bestellungsnummer: " + order.getId());
        System.out.println("Bestellungsstatus: " + order.getStatus());
        System.out.println("Bestelldatum: " + order.getDateTime());
        System.out.println("Bestellte Produkte: ");
        for (Product product : orderedProducts) {
            System.out.println("- " + product.getName());
        }
    }


}