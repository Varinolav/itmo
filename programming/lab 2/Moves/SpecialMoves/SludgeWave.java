package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

// Sludge Wave deals damage and has a 10% chance of poisoning the target.
// Poison or Steel type Pokémon cannot be poisoned.
public final class SludgeWave extends SpecialMove {
    public SludgeWave() {
        super(Type.POISON, 95, 100);
    }

    private boolean isPoisoned = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        if ((Math.random() <= 0.1) && !(p.hasType(Type.POISON)) && !(p.hasType(Type.STEEL))) {
            Effect.poison(p);
            this.isPoisoned = true;
        }
    }

    @Override
    protected String describe() {
        return "Использует Razor Shell" + ((isPoisoned) ? "и отравляет цель " : "");
    }
}
