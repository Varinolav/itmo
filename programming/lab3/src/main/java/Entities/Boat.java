package Entities;

import Enums.Location;
import Errors.BrokenBoatException;
import Interfaces.PositionChangeable;

public class Boat extends Entity implements PositionChangeable {
    private String position;
    private boolean waterAround;

    private String place = "прежнее";
    private int mileage = 0;
    private boolean broken = false;

    public Boat(String name) {
        super(name);
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setWaterAround(boolean state) {
        waterAround = state;
    }

    public String checkWaterAround() {
        return waterAround ? ", и вода была около нее. " : ", и воды около нее не было. ";
    }


    public String checkPlace(String place) {
        if (place.equals("прежнее")) {
            return super.getName() + " лежала на прежнем месте";

        } else {
            return super.getName() + " лежала не совсем на прежнем месте";
        }
    }

    public void addMileage(int mileage) {
        this.mileage += mileage;
    }

    public void setCrash(boolean state) {
        broken = state;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public String sail(Location location) throws BrokenBoatException {
        if (broken) {
            throw new BrokenBoatException(location);
        }
        addMileage(location.getMileage());
        return location.getTitle() + " слишком " + location.getMileage() + " миль";
    }


    public String crash() {
        setCrash(true);

        return " потерпели крушение";
    }

    public String fix(){
        setCrash(false);
        return " исправлю ее повреждения ";
    }

    public String checkSailAbility(String d) {
        if (!broken) {
            return ", она выдержала бы " + d;

        }
        return ", она не выдержала бы " + d;
    }
}
