package DesignPatterns.DecoratorPattern.Coffee;

/*
    1. CoffeeDecorator is-a coffee  {only some extra ingridients added}
    2. CoffeeDecorator has-a coffee (which is to be decorated)
*/
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

//Wrap Coffee
class MilkDecorator extends CoffeeDecorator {
    
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + added Milk";
    }
    
    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}

class SugarDecorator extends CoffeeDecorator {
    
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + added Suger";
    }
    
    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}


public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " " + coffee.cost());

        Coffee milkDecoratedCoffee = new MilkDecorator(coffee);
        System.out.println(milkDecoratedCoffee.getDescription() + " " + milkDecoratedCoffee.cost());
        
        Coffee sugarDecoratedCoffee = new SugarDecorator(milkDecoratedCoffee);
        System.out.println(sugarDecoratedCoffee.getDescription() + " " + sugarDecoratedCoffee.cost());
    }    
}