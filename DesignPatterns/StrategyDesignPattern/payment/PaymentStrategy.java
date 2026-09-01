package StrategyDesignPattern.payment;

public interface PaymentStrategy { 
    void pay(double amount);
}

//concrete strategies (different ways to do something)
class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making payment using credit card");    
    }
}


class NetBankingStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making payment using Net-Banking");    
    }
}

class UPIStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making payment using UPI");    
    }
}