package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//Sand Attack lowers the target's Accuracy by one stage.

public final class SandAttack extends StatusMove {
    public SandAttack() {
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "Использует Sand Attack";
    }
}
