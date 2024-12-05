package Entities;

import Entities.Action.DoEverything;
import Entities.Action.TakeALook;
import Entities.Items.Boat;
import Entities.Items.SailBoat;
import Entities.Work.Job;
import Enums.Action;
import Enums.Location;
import Enums.ToMove;
import Errors.BrokenBoatException;
import Errors.HandsException;

public class Story {
    public static String play(){
        Person me = new Person("я");
        Person ksuri = new Person("приятель Ксури");
        Boat sailBoat = new SailBoat("парусный бот", "дном вниз", "прежнее");
        Boat boat = new Boat("шлюпка", "дном вниз", "прежнее");


        StringBuilder story = new StringBuilder("Вот когда ");
        story.append(me.regret("моем маленьком " + ksuri.getName(), sailBoat.getName()));
        try {
            String doSailing = sailBoat.sail(Location.AFRICA);
            story.append("На котором " + me.getName() + " прошел " + doSailing + "!");

        } catch (BrokenBoatException e) {
            story.append("Лодка сломана, до " + e.getMessage() + " не добраться");
        }

        story.append(" Но что толку было вспоминать?.. ");
        story.append(me.getName() + " " + me.doing(new TakeALook("взглянуть")) + " наша корабельная " + boat.getName());
        Storm storm = new Storm("буря");
        story.append(", которую еще в ту " + storm.getName());
        story.append(", когда мы" + storm.drop(boat, Location.ISLAND, "другое"));

        Surf surf = new Surf("прибой");
        String updPlace = surf.drop(boat, Location.BEACH, "кверху дном");
        story.append(boat.checkPlace(boat.getPlace()));
        story.append(updPlace);
        story.append(me.tryDo(Action.FIX, Action.MOVEDOWN) + boat.getName() + ", "); // enum

        try {
            String doSailing = boat.sail(Location.BRAZIL);
            story.append(me.getName() + doSailing);
        } catch (BrokenBoatException e) {
            story.append("она выдержала бы морское путешествие, и " + me.getName() + e.getMessage() + ".");
        }
        try {
            story.append(me.workWithHands(new Job("работы", 10), 1)); // не колво рук а колво людей
        } catch (HandsException e) {
            story.append(e.getMessage());
        }
        // абстракции работы с требуемыми руками
        if (!me.canMove(ToMove.BOAT) && !me.canMove(ToMove.ISLAND)) {
            story.append(me.getName() + " упустил из виду, что перевернуть и сдвинуть с места эту " + boat.getName() + " для меня такая же непосильная задача, как сдвинуть с места мой остров. ");
        } else {
            story.append("Перевернуть и сдвинуть с места эту " + boat.getName() + " для меня так же легко, как сдвинуть с места мой остров.");
        }
        story.append(" Но, невзирая ни на что, " + me.doing(new DoEverything(" сделать все, что было в моих силах: "))); // через ду людское
        Forest.Pole pole = Forest.chop("жердей");
        story.append(pole.makeLever());
        story.append(me.getName() + pole.move() + boat.getName() + ".");
        story.append(me.move(boat, "на дно"));
        me.move(boat, "на дно");
        return story.toString();
    }
}
