package ZOO;

import ZOO.Animals.*;
import ZOO.Food.Grass;
import ZOO.Food.Meat;
import ZOO.Worker.Worker;

public class Zoo {
    public static void main(String[] args) {
        Beaver beaver = new Beaver("Зубастый бобр", "Бурый");
        Butterfly butterfly = new Butterfly("Тропическая бабочка", "Красная");
        Duck duck = new Duck("Дикая уточка", "Серая");
        Fish fish = new Fish("Хищная рыбка", "Серебристая");
        Goat goat = new Goat("Резвая козочка", "Белая");
        Wolf wolf = new Wolf("Злой волк", "Серый");

        Grass grass1 = new Grass("трава");
        Grass grass2 = new Grass("цветочный нектар");
        Grass grass3 = new Grass("кора");

        Meat meat1 = new Meat("червяки");
        Meat meat2 = new Meat("говядина");

        Worker worker = new Worker("Работник зоопарка");

        worker.feed(beaver, grass3);
        worker.feed(beaver, meat1);
        System.out.println();

        worker.feed(butterfly, grass2);
        worker.feed(butterfly, meat2);
        System.out.println();

        worker.feed(duck, meat1);
        worker.feed(duck, grass3);
        System.out.println();

        worker.feed(fish, meat1);
        worker.feed(fish, grass2);
        System.out.println();

        worker.feed(goat, grass1);
        worker.feed(goat, meat2);
        System.out.println();

        worker.feed(wolf, meat2);
        worker.feed(wolf, grass3);
        System.out.println();

        worker.getVoice(beaver);
        worker.getVoice(duck);
        worker.getVoice(goat);
        worker.getVoice(wolf);

        System.out.println();

        Swim[] pond = new Swim[5];
        pond[0] = beaver;
        pond[1] = duck;
        pond[2] = fish;
        pond[3] = goat;
        pond[4] = wolf;

        for (Swim animals : pond) {
            animals.swim();
        }

        System.out.println();

        beaver.run();
        beaver.swim();
        System.out.println();

        butterfly.fly();
        System.out.println();

        duck.run();
        duck.swim();
        duck.fly();
        System.out.println();

        fish.swim();
        System.out.println();

        goat.run();
        goat.swim();
        System.out.println();

        wolf.run();
        wolf.swim();
        System.out.println();















    }
}
