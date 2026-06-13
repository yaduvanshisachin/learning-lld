package SOLID.DIP;

public class DipFollowed {
    public static void main(String[] args) {
        Service service = new Service(new MongoDB());
        Service service2 = new Service(new MySql());

        service.persistToDb();
        service2.persistToDb();
    }
}

class Service{
    private Persist persist;

    Service(Persist persist){
        this.persist = persist;
    }

    void persistToDb(){
        persist.save();
    }
    
}

//Basically Repository Layer (Data Persistence Layer)
interface Persist{
    void save();
}

class MySql implements Persist{
    @Override
    public void save(){
        System.out.println("Saving to MySql database...");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}     
    }
}

class MongoDB implements Persist{
    @Override
    public void save(){
        System.out.println("Saving to MongoDb database...");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}     
    }
}