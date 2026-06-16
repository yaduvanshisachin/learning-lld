package StrategyDesignPattern.payment;

public class ShoppingCart {
    private double amount;
    private PaymentStrategy strategy;

    ShoppingCart(double amount, PaymentStrategy strategy){
        this.amount = amount;
        this.strategy = strategy;
    }

    public void makePayment(){
        strategy.pay(amount);
    }
}

class Demo{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1500, new NetBankingStrategy());

        cart.makePayment();
    }
}
