package Entities;

public class Forest {
    protected String name;

    public Forest(String name) {
        this.name = name;
    }

    public record Pole(String thing) {
        public String makeLever() {
            return "нарубил " + this.thing + ", которые должны были служить мне рычагами, ";
        }

        public String move() {
            return " перетащил их к ";
        }
    }

    public static Pole chop(String name) {
        return new Pole(name);
    }
}
