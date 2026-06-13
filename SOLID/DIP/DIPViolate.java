package SOLID.DIP;

public class DIPViolate {
    public static void main(String[] args) {
        Service sqlService = new Service(new MySql());
        sqlService.saveToSql();

        Service mongoService = new Service(new MongoDB());
        mongoService.saveToMongo();
    }
}


class Service{
    private MySql mySql;
    private MongoDB mongoDb;

    public Service(MySql sql){
        this.mySql = sql;
    }

    public Service(MongoDB mongo){
        this.mongoDb = mongo;
    }

    public void saveToSql() {
        if (mySql != null) {
            mySql.saveToMySql();
        }
    }

    public void saveToMongo() {
        if (mongoDb != null) {
            mongoDb.saveToMongoDB();
        }
    }
}

class MySql{
    void saveToMySql(){
        System.out.println("Saving to MySql database...");
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        
    }
}

class MongoDB{
    void saveToMongoDB(){
        System.out.println("Saving to MongoDb database...");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}     
    }
}