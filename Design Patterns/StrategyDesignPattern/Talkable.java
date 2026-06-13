package StrategyDesignPattern;

//Strategy Talkable
public interface Talkable{
    void talk();
}


class NormalTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Talking Normally");
    }
}

class NoTalk implements Talkable{
    @Override
    public void talk() {
        System.out.println("Do Not Talk");
    }
}
