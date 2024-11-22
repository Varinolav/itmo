package Entities;

import Enums.Location;
import Interfaces.Droppable;

public class Surf extends Weather implements Droppable {
    public Surf(String name) {
        super(name);
    }

    @Override
    public String drop(Boat boat, Location location) {
        boat.setPlace(location.getTitle());
        boat.setPosition("кверху дном");
        boat.setWaterAround(false);
        return "ее опрокинул " + this.getName() + " " + boat.getPosition() + boat.getPlace();
    }
}
