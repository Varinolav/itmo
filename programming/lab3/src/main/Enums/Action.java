package Enums;

public enum Action {
    FIX("починить"),
    MOVEDOWN("спустить");

    private final String text;
    Action(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
