package Enums;

public enum ToMove {
    ISLAND("мой остров", 1000),
    BOAT("шлюпка", 1000),
    CHOP("жердей", 1);

    private final String title;
    private final int requiredStrength;

    ToMove(String title, int requiredStrength) {
        this.requiredStrength = requiredStrength;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public int getRequiredStrength(){
        return requiredStrength;
    }

}
