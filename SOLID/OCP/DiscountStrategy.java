package SOLID.OCP;


class DiscountCalculator {
    //OCP- voilation
    public double calculateDiscount(String customerType, double amount) {

        if ("REGULAR".equals(customerType)) {
            return amount * 0.05;
        } else if ("PREMIUM".equals(customerType)) {
            return amount * 0.10;
        } else if ("VIP".equals(customerType)) {
            return amount * 0.20;
        }

        return 0;
    }


    public static void main(String[] args) {
        RegularDiscount rg = new RegularDiscount();
        rg.calculateDiscout(5000);
        
        PremiumDiscount pg = new PremiumDiscount();
        pg.calculateDiscout(5000);
        
        VipDiscount vd = new VipDiscount();
        vd.calculateDiscout(5000);
    }
}


public interface DiscountStrategy {
    double calculateDiscout(double amount);
}

//now DiscountStrategy is Open for extension and closed for modification
class RegularDiscount implements DiscountStrategy{
    
    @Override
    public double calculateDiscout(double amount) {
        return amount * 0.5;
    }
}

class PremiumDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscout(double amount) {
        return amount * 0.10;
    }
}


class VipDiscount implements DiscountStrategy{
    
    @Override
    public double calculateDiscout(double amount) {
        return amount * 0.20;
    }
}

