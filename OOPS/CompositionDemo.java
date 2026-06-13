package OOPS;

public class CompositionDemo{
    public static void main(String[] args) {
        Car car = new Car("Honda City", "Petrol");

        car.startCar();
    }
}

class Car{  
    private String model;
    private Engine engine; //composition  (Car has-a Engine, car is composed of engine)

    public Car(String model , String type){  //inject engine inside the car
        this.model = model;
        this.engine = new Engine(type);
    }

    void startCar(){
        System.out.println("Starting " + model);
        engine.start();
    }
}


class Engine{
    private String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }

    void start(){
        System.out.println(engineType + "Engine started");
    }
}