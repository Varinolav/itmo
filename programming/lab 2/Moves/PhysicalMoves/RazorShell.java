package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

// Razor Shell deals damage and has a 50% chance of lowering the target's Defense by one stage.

public final class RazorShell extends PhysicalMove {
    public RazorShell() {
        super(Type.WATER, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.5) {
            p.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "Использует Razor Shell";
    }
}
