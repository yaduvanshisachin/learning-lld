package Food_Delivery_App.modals;

import java.util.Set;

import Food_Delivery_App.domain.PaymentStrategy;

public class Order {
    static int nextOrderid;

    private int orderId;
    private User user;
    private Restorent restorent;
    private Set<MenuItem> items;

    private PaymentStrategy PaymentStrategy;
    private double total;
}

//to be completed