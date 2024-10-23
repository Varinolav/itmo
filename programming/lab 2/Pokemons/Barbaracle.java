package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.PhysicalMoves.BrutalSwing;


public final class Barbaracle extends Binacle {
    public Barbaracle(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.WATER);
        setStats(72, 105, 115, 54, 86, 68);
        addMove(new BrutalSwing());
    }
}
