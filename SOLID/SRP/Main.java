package SOLID.SRP;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 25);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(cart);

        DBSaver dbSaver = new DBSaver();
        dbSaver.saveToDatabase(cart);
    }
}
