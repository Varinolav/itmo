package Errors;

import Enums.Location;

public class BrokenBoatException extends Exception {
    private final Location location;
    public BrokenBoatException(Location location){
        this.location = location;
    }
    @Override
    public String getMessage(){
        return location.getTitle();
    }

}
