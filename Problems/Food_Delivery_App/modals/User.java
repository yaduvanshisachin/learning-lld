package Food_Delivery_App.modals;

public class User {
    private String id;
    private String name;
    private String address;
    private Cart cart;

    public User(String userId, String name, String address) {
        this.id = userId;
        this.name = name;
        this.address = address;
    }

    //getters & setters
}
