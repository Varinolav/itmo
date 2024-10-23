package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

// The user swings its body around violently to inflict damage on everything in its vicinity.

public final class BrutalSwing extends PhysicalMove {
    public BrutalSwing() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected String describe() {
        return "Использует Brutal Swing";
    }
}
