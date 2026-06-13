package SOLID.SRP;

public class DBSaver {

    public void saveToDatabase(ShoppingCart cart) {
        // Simulated database save
        System.out.println("Saving shopping cart to database...");
        System.out.println("Total amount: $" + cart.calculateTotalPrice());
    }
}