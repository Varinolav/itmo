package Entities.Items;

import Enums.Location;
import Errors.BrokenBoatException;
import Interfaces.PositionChangeable;

public class Boat extends Item implements PositionChangeable {
    private boolean waterAround;

    private int mileage = 0;
    private boolean broken = false;

    public Boat(String name, String position, String place) {
        super(name, position, place);
    }



    public String getName(){
        return name;
    }

    public void addMileage(int mileage) {
        this.mileage += mileage;
    }

    public void setCrash(boolean state) {
        broken = state;
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

    public String fix() {
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
