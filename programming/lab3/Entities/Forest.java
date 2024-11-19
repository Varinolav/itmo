package Entities;

public class Forest extends Entity {
    public Forest(String name) {
        super(name);
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
