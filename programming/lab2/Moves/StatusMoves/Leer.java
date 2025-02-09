package Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

// Leer lowers the target's Defense by one stage.

public final class Leer extends StatusMove {
    public Leer(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return "Использует Leer";
    }
}
