package Entities.Action;

public abstract class Action {
    protected String name;
    private final boolean SUCCESS = true;
    private final boolean FAIL = false;


    public Action(String name) {
        this.name = name;
    }

    public String doAction() {

        return name;
    }


}
