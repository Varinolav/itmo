package Entities;

import Enums.ToMove;
import Interfaces.PositionChangeable;

public class Person extends Entity {
    private int hands = 2;
    private boolean fixer = false;
    private int strength = 10;

    public Person(String name) {
        super(name);

    }

    public String regret(String... names) {
        if (names.length == 0) {
            throw new RuntimeException("Нельзя сожалеть ни о чем.");
        }
        StringBuilder regretting = new StringBuilder(this.getName() + " пожалел о ");
        for (String i : names) {
            regretting.append(i).append(", ");
        }

        return regretting.toString();

    }


    public String takeALook(String name) {
        return this.getName() + " решил сходить взглянуть на " + name;
    }

    public String areEnoughHands(String work) {
        int pairOfHands = hands / 2;
        if (pairOfHands <= 1) {
            return "Но для такой " + work + " было мало одной пары рук. ";
        }
        return "Для такой " + work + " рук достаточно. ";
    }


    public String tryDo(String... names) {
        String[] toDo = names;
        StringBuilder message = new StringBuilder(fixer ? "Мне удалось " : " Если бы мне удалось ");
        for (String i : toDo) {
            message.append(i).append(", ");

        }
        return message.toString() + " на воду эту ";

    }

    public boolean canMove(ToMove movable) {
        int pairOfHands = hands / 2;
        return pairOfHands >= 1 && strength >= movable.getRequiredStrength();
    }

    public String berserkMode() {
        return "Но, не взирая ни на что, " + this.getName() + " решил сделать все, что было в моих силах: ";
    }

    public String move(PositionChangeable thing, String position) {
        thing.setPlace(position);
        return "перевернуть " + thing.toString() + " " + position;

    }
}
