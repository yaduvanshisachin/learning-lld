package DesignPatterns.DecoratorPattern.Coffee;

public interface Coffee {
    String getDescription();
    
    double cost();
}


class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
