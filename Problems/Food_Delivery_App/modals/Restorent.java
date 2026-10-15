package Food_Delivery_App.modals;

import java.util.List;

public class Restorent {
    private static int nextId;

    private int restorentId;
    private String name;
    private String location;
    private Menu menu;

    Restorent(String name, String location, Menu menu) {
        this.name = name;
        this.location = location;
        this.menu = menu;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }
}

