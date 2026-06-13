package SOLID.SRP;

public class InvoicePrinter {
    //this will have the reference to ShoppingCart
    // private ShoppingCart shoppingCart;

    public void printInvoice(ShoppingCart cart) {
        System.out.println("===== INVOICE =====");

        for (Product product : cart.getProducts()) {
            System.out.println(
                product.getName() + " : $" + product.getPrice()
            );
        }

        System.out.println("-------------------");
        System.out.println("Total: $" + cart.calculateTotalPrice());
    }
}
