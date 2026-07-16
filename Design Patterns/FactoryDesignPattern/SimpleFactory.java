package FactoryDesignPattern;

public class SimpleFactory{
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();

        Burger basicBurger = factory.createBurger("Standard");

        basicBurger.prepare();
    }
}

interface Burger{
    void prepare();
}

class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Basic burger with maida");
    }
}

class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Standard Burger with cheese");
        
    }
}

class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Premium Burger with gold");
        
    }
}

class BurgerFactory{

    public Burger createBurger(String type){
        if(type == "Basic"){
            return new BasicBurger();
        }
        else if(type == "Standard"){
            return new StandardBurger();
        }
        else if(type == "Premium"){
            return new PremiumBurger();
        }

        throw new IllegalArgumentException("Invalid Burger Type");
    }
}