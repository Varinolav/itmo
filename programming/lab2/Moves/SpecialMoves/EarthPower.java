package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

// Earth Power deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
public final class EarthPower extends SpecialMove {
    public EarthPower() {
        super(Type.GROUND, 90, 100);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }

    }

    @Override
    protected String describe() {
        return "Использует Earth Power";
    }
}

