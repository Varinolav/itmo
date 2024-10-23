package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

// Double Team raises the user's Evasiveness by one stage, thus making the user more difficult to hit.

public final class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "Использует Double Team";
    }
}
