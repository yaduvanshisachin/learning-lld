package StrategyDesignPattern;

//Strategy Flyable
interface Flyable{
    void fly();
}


class FlyWithWing implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly with wing");
    }
}

class FlyWithJet implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly using Jet");
    }
}