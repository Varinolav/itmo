package Pokemons;

import ru.ifmo.se.pokemon.*;
import Moves.PhysicalMoves.RockTomb;
import Moves.StatusMoves.Leer;
import Moves.StatusMoves.DoubleTeam;
import Moves.SpecialMoves.FireBlast;

public final class Kangaskhan extends Pokemon {
    public Kangaskhan(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(105, 95, 80, 40, 80, 90);
        setMove(new DoubleTeam(),new RockTomb() , new FireBlast(), new Leer());
    }
}
