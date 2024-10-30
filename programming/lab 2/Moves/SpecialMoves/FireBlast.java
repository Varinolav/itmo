package Moves.SpecialMoves;


import ru.ifmo.se.pokemon.*;

// Fire Blast deals damage and has a 10% chance of burning the target.

public final class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    private boolean isBurned = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.burn(p);
            this.isBurned = true;
        }
    }

    @Override
    protected String describe() {
        return "Использует Fire Blast" + ((isBurned) ? "и поджигает цель" : "");
    }
}