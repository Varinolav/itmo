package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

public final class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe() {
        return "использует Rock Tomb";
    }
}

