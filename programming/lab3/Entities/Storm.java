package Entities;

import Enums.Location;
import Interfaces.Droppable;

public class Storm extends Weather implements Droppable {

    public Storm(String name) {
        super(name);
    }

    @Override
    public String drop(Boat boat, Location location) {
        String status = boat.crash();
        int miles = location.getMileage();
        boat.addMileage(miles);
        return status + ", выбросило на " + location.getTitle() + " в " + miles + " милях от моего жилья. ";
    }

}
