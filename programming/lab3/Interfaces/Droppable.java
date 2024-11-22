package Interfaces;

import Entities.Boat;
import Enums.Location;

public interface Droppable{
    String drop(Boat boat, Location location);
}