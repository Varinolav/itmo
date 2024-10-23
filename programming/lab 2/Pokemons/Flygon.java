package Pokemons;

import Moves.PhysicalMoves.Bulldoze;
import Moves.SpecialMoves.Boomburst;

import ru.ifmo.se.pokemon.*;

public final class Flygon extends Vibrava {
    public Flygon(String name, int level) {
        super(name, level);
        setType(Type.GROUND, Type.DRAGON);
        setStats(80, 100, 80, 80, 80, 100);
        addMove(new Bulldoze());
    }
}
