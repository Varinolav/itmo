package Entities;

import Entities.Action.Action;
import Entities.Items.Boat;
import Entities.Items.Item;
import Enums.ToMove;
import Errors.HandsException;
import Interfaces.PositionChangeable;
import Entities.Work.Work;

public class Person  {
    private int hands = 2;
    private boolean fixer = false;
    private int strength = 10;
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String doing(Action... actions) {
        StringBuilder toDo = new StringBuilder(this.getName() + " решил ");
        for (Action action : actions) {
            toDo.append(action.doAction()).append(", ");
        }
        return toDo.toString();

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


    public String tryDo(Enums.Action... names) {
        Enums.Action[] toDo = names;
        StringBuilder message = new StringBuilder(fixer ? "Мне удалось " : " Если бы мне удалось ");
        for (Enums.Action i : toDo) {
            message.append(i.getText()).append(", ");

        }
        return message.toString() + " на воду эту ";

    }

    public String workWithHands(Work work, int peopleAmount) throws HandsException {
        int requiredHands = work.getrequiredPeopleAmount();
        if (!work.execute(peopleAmount)) {
            throw new HandsException(" для такой " + work.getName() + " было мало одной пары рук. ");
        }
        return "Для такой " + work.getName() + " достаточно рук";


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

        if (canMove(ToMove.BOAT) && thing instanceof Boat) {
            String fixed = ((Boat) thing).fix();
            String readyToSail = ((Boat) thing).checkSailAbility(" в море");
            return "Мне удалось перевернуть " + thing.toString() + " " + position + fixed + readyToSail;

        } else if (!canMove(ToMove.BOAT) && thing instanceof Boat) {
            StringBuilder partOfStory = new StringBuilder();
            partOfStory.append(getName() + " обольщал себя мыслью, что, ");
            partOfStory.append("если мне удастся перевернуть " + ((Boat) thing).getName() + " на дно");
            partOfStory.append(", " + getName() + " исправлю ее повреждения, ");
            partOfStory.append("и у меня будет такая лодка, в которой смело можно будет пуститься в море.");
            return partOfStory.toString();
        }
        return getName() + " переместил" +  ((Item) thing).getName() + " " + position;
    }
}
