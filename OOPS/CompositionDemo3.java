package OOPS;

public class CompositionDemo3 {
    public static void main(String[] args) {
        Order order1 = new Order("101", 2500, "UPI");

        order1.placeOrder();
    }
}


//Each Order has-a payment associated with it  (ek nya payment bna ke apne Oder assign kr do)
class Order{
    private String orderId;
    private Payment payment;

    public Order(String orderId, double amount, String paymentMethod){
        this.orderId = orderId;
        this.payment = new Payment(amount, paymentMethod);
    }

    public void placeOrder(){
        System.out.println("Oder is being processed....");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        
        payment.makePayment();
        System.out.println("Oder placed");
    }
}

class Payment{
    private double amount;
    private String paymentMethod;

    Payment(double amount, String paymentMethod){
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(){
        System.out.println("Payment processing..");
        try {
            System.out.println(Thread.currentThread().getName()+ " thread is making payment");
            Thread.sleep(2000);
        } catch (Exception e) {}
        
        System.out.println("Payment of "+ amount + " made using "+ paymentMethod);
    }
}