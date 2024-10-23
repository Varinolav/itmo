package Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

// Boomburst deals massive damage and targets all adjacent Pokémon in battle, including allies.
public final class Boomburst extends SpecialMove {
    public Boomburst() {
        super(Type.NORMAL, 140, 100);
    }


    @Override
    protected String describe() {
        return "Использует Boomburst";
    }
}
