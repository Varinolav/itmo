package Entities;

import Entities.Items.Boat;
import Entities.Items.Item;
import Enums.Location;
import Interfaces.Droppable;

public class Surf extends Weather implements Droppable {
    public Surf(String name) {
        super(name);
    }

    public String drop(Item item, Location location, String position) {

        item.setPlace(location.getTitle());
        item.setPosition(position);
        return "ее опрокинул " + this.name + " " + item.getPosition() + item.getPlace();
    }
}
