package Entities;

import Entities.Action.Drop;
import Entities.Items.Boat;
import Entities.Items.Item;
import Enums.Location;
import Interfaces.Droppable;

public class Storm extends Weather implements Droppable {

    public Storm(String name) {
        super(name);
    }


    public String getName(){
        return name;
    }
    public String drop(Item item, Location location, String position) {
        int miles = location.getMileage();

        if (item instanceof Boat) {
            String status = ((Boat) item).crash();
            ((Boat) item).addMileage(miles);
            return status + ", выбросило на " + location.getTitle() + " в " + miles + " милях от моего жилья. ";

        }
        return ", выбросило на " + location.getTitle() + " в " + miles + " милях от моего жилья. ";
    }

}
