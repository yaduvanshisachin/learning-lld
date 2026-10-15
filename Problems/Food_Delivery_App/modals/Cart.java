package Food_Delivery_App.modals;

import java.util.Set;

public class Cart {
    private Restorent restorent;
    private Set<MenuItem> menuItems;

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public long getTotalCost() {
        long totalCost = 0;

        for(var item : menuItems) {
            totalCost += item.getPrice();
        }

        return totalCost;
    }

    public void clearCart() {
        menuItems.clear();
    }
}
