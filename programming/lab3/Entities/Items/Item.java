package Entities.Items;

public abstract class Item  {
    protected String name;
    protected String place;
    protected String position;

    public Item(String name, String position, String place){
        this.name = name;
        this.place = place;
        this.position = position;
    }

    public String getName(){
        return name;
    }
    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String checkPlace(String place) {
        if (place.equals("прежнее")) {
            return name + " лежала на прежнем месте";

        } else {
            return name + " лежала не совсем на прежнем месте, ";
        }
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
}
