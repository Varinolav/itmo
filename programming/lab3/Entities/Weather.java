package Entities;


import Enums.Location;

public abstract class Weather extends Entity {
    public Weather(String name) {
        super(name);
    }

    abstract String drop(Boat boat, Location location);

}
