package OOPS;

public class CompositionDemo2 {
    public static void main(String[] args) {
        Person person = new Person("Sachin", 206, "Mumbai", 400069);
        person.display();
    }
}

//every person has-a address (Composition -->  person is composed of address)
class Person{  
    Address address;
    String name;

    public Person(String name, int houseNo, String city, int pincode){
        this.name = name;
        this.address = new Address(houseNo, city, pincode);
    }
    
    void display(){
        System.out.print(name + " lives at ");
        address.lives();
    }
}

class Address{
    private int houseNo;
    private String city;
    private int pincode;

    Address(int houseNo, String city, int pincode){
        this.houseNo = houseNo;
        this.city = city;
        this.pincode = pincode;
    }

    void lives(){
        System.out.println("Room no: "+ houseNo +", "+ "City: " + city +", PinCode: "+ pincode);
    }
}