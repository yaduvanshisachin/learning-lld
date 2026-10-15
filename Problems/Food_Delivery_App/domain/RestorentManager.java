package Food_Delivery_App.domain;

import java.util.ArrayList;
import java.util.List;

import Food_Delivery_App.modals.Restorent;

public class RestorentManager {
    private static RestorentManager instance;

    List<Restorent> restorents;

    private RestorentManager() {}

    public static RestorentManager getInstance() {
        if (instance == null) {
            instance = new RestorentManager();
        }
        return instance;
    }

    public void addRestorent(Restorent restorent) {
        restorents.add(restorent);
    }

    public List<Restorent> searchByLocation(String location) {
        List<Restorent> result = new ArrayList<>();

        for(var restorent : restorents) {
            if(restorent.getLocation().equals(location)) {
                result.add(restorent);
            }
        }

        return result;
    }
}
