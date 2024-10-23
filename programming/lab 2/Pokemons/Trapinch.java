package Pokemons;

import Moves.SpecialMoves.EarthPower;
import Moves.StatusMoves.Rest;
import ru.ifmo.se.pokemon.*;

public class Trapinch extends Pokemon{
    public Trapinch(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(45, 100, 45, 45, 45, 10);
        setMove(new Rest(), new EarthPower());
    }
}
