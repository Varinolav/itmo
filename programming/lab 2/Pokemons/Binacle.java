package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.StatusMoves.SandAttack;
import Moves.PhysicalMoves.RazorShell;
import Moves.SpecialMoves.SludgeWave;

public class Binacle extends Pokemon {
    public Binacle(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.WATER);
        setStats(42, 52, 67, 39, 56, 50);
        setMove(new SandAttack(), new RazorShell(), new SludgeWave());
    }

}
