package Entities.Work;

public abstract class Work {
    protected int requiredPeopleAmount;
    protected String name;

    public Work(String name, int requiredPeopleAmount) {
        this.name = name;
        this.requiredPeopleAmount = requiredPeopleAmount;

    }

    public int getrequiredPeopleAmount() {
        return requiredPeopleAmount;
    }

    public boolean execute(int requiredPeopleAmount) {
        return requiredPeopleAmount == this.requiredPeopleAmount;
    }

    public String getName() {
        return name;
    }
}
