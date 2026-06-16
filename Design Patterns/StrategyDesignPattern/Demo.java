package StrategyDesignPattern;

//Robot has-a different strategies to create the robot
abstract class Robot{
    Talkable talkable;
    Walkable walkable;
    Flyable flyable;

    Robot(Walkable walkable, Talkable talkable, Flyable flyable){
        this.walkable = walkable;
        this.flyable = flyable;
        this.talkable = talkable;
    }
    
    //methods of Robot class (dump methods--> deligates behaviour to statregies)
    void walk(){
        walkable.walk();
    }
    void talk(){
        talkable.talk();
    }

    void fly(){
        flyable.fly();
    }

    abstract void projection();
}


class CompanionRobot extends Robot{
    
    CompanionRobot(Walkable walkable, Talkable talkable, Flyable flyable){
        super(walkable, talkable, flyable);
    }

    @Override
    void projection() {
        System.out.println("Displying companion robot features...");
    }
}

class WorkerRobot extends Robot{
    
    WorkerRobot(Walkable walkable, Talkable talkable, Flyable flyable){
        super(walkable, talkable, flyable);
    }

    @Override
    void projection() {
        System.out.println("Displying worker robot features...");
    }
}

public class Demo {
    public static void main(String[] args) {
        WorkerRobot robot1 = new WorkerRobot(new NormalWalk(), new NoTalk(), new FlyWithWing());
        
        CompanionRobot robot2 = new CompanionRobot(new NoWalk(), new NormalTalk(), new FlyWithJet());
        
        robot1.projection();
        robot1.walk();
        robot1.talk();
        robot1.fly();

        System.out.println();

        robot2.projection();
        robot2.walk();
        robot2.talk();
        robot2.fly();
    }
}
