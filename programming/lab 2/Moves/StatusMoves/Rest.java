package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

// User sleeps for 2 turns, but user is fully healed.

public final class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e);
        p.setMod(Stat.HP, (int) -(p.getStat(Stat.HP) - p.getHP()));


    }

    @Override
    protected String describe() {
        return "Использует Rest";
    }
}
