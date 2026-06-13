package SOLID.SRP;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public double calculateTotalPrice(){
        // double totalPrice = 0;

        // for(Product product : products){
        //     totalPrice += product.getPrice();
        // }

        double totalPrice = products.stream()
                        .mapToDouble(product -> product.getPrice())
                        .sum();

        return totalPrice;
    }
}
