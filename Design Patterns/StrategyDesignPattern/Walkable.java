package StrategyDesignPattern;

//Strategy Walkable
interface Walkable{
    void walk();
}

class NormalWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Walk Normally");
    }
}

class NoWalk implements Walkable{  //nowalk is also a type of walk
    @Override
    public void walk() {
        System.out.println("Do not walk");
    }
}