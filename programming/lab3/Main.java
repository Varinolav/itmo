import Entities.*;
import Enums.*;
import Errors.BrokenBoatException;

public class Main {
    public static void main(String[] args) throws BrokenBoatException {
        Person me = new Person("я");
        Person ksuri = new Person("приятель Ксури");
        Boat sailBoat = new SailBoat("парусный бот");
        Boat boat = new Boat("шлюпка");

        System.out.print("Вот когда ");
        System.out.print(me.regret("моем маленьком " + ksuri.getName(), sailBoat.getName()));
        try {
            String doSailing = sailBoat.sail(Location.AFRICA);
            System.out.print("На котором " + me.getName() + " прошел " + doSailing + "!");

        } catch (BrokenBoatException e) {
            System.out.println("Лодка сломана, до " + e.getMessage() + " не добраться");
        }

        System.out.println(" Но что толку было вспоминать?.. ");
        System.out.print(me.takeALook("наша корабельная " + boat.getName()));

        Storm storm = new Storm("буря");
        System.out.print(", которую еще в ту " + storm.getName());
        System.out.print(", когда мы" + storm.drop(boat, Location.ISLAND));
        Surf surf = new Surf("прибой");
        String updPlace = surf.drop(boat, Location.BEACH);
        System.out.println(boat.checkPlace(boat.getPlace()));
        System.out.print(updPlace);
        System.out.print(boat.checkWaterAround());
        System.out.println(me.tryDo("починить", "спустить") + boat.getName() + ", ");
        try {
            String doSailing = boat.sail(Location.BRAZIL);
            System.out.print(me.getName() + doSailing);
        } catch (BrokenBoatException e) {
            System.out.print("она выдержала бы морское путешествие, и " + me.getName() + e.getMessage() + ".");
        }
        System.out.println(me.areEnoughHands("работы"));
        if (!me.canMove(ToMove.BOAT) && !me.canMove(ToMove.ISLAND)) {
            System.out.println(me.getName() + " упустил из виду, что перевернуть и сдвинуть с места эту " + boat.getName() + " для меня такая же непосильная задача, как сдвинуть с места мой остров. ");
        } else {
            System.out.println("Перевернуть и сдвинуть с места эту " + boat.getName() + " для меня так же легко, как сдвинуть с места мой остров.");

        }
        System.out.print(me.berserkMode());
        Forest.Pole pole = Forest.chop("жердей");
        System.out.print(pole.makeLever());
        System.out.println(me.getName() + pole.move() + boat.getName() + ".");
        if (me.canMove(ToMove.BOAT)) {
            System.out.print("Мне удалось ");
            System.out.println(me.move(boat, "на дно"));
            System.out.print(boat.fix());
            System.out.println(boat.checkSailAbility(" в море"));

        } else {
            System.out.print(me.getName() + " обольщал себя мыслью, что, ");
            System.out.print("если мне удастся перевернуть " + boat.getName() + " на дно");
            System.out.println(", " + me.getName() + " исправлю ее повреждения, ");
            System.out.print("и у меня будет такая лодка, в которой смело можно будет пуститься в море.");

        }

    }
}
