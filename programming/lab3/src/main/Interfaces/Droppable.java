package Interfaces;

import Entities.Items.Item;
import Enums.Location;

public interface Droppable{
    public String drop(Item item, Location location, String position);
}