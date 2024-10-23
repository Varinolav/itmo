import ru.ifmo.se.pokemon.*;
import Pokemons.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Kangaskhan("Кросик", 1);
        Pokemon p2 = new Vibrava("Челик", 1);
        Pokemon p3 = new Barbaracle("Монстр", 1);

        Pokemon p4 = new Binacle("Моржик", 1);
        Pokemon p5 = new Trapinch("Пипка", 1);
        Pokemon p6 = new Flygon("Бобка", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}
