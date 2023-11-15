package ZOO;

import ZOO.Animals.*;
import ZOO.Aviary.Aviary;
import ZOO.Aviary.AviarySize;
import ZOO.Exception.WrongFoodException;
import ZOO.Food.Grass;
import ZOO.Food.Meat;
import ZOO.Worker.Worker;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {

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

        System.out.println("Хищные животные:");
        Aviary<Carnivorous> carnivorousAviary2 = new Aviary<>(AviarySize.MEDIUM);
        carnivorousAviary2.addAnimal(fish.getName(), new Fish());

        Aviary<Carnivorous> carnivorousAviary3 = new Aviary<>(AviarySize.LARGE);
        carnivorousAviary3.addAnimal(duck.getName(), new Duck());

        Aviary<Carnivorous> carnivorousAviary4 = new Aviary<>(AviarySize.HUGE);
        carnivorousAviary4.addAnimal(wolf.getName(), new Wolf());
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Травоядные животные:");
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.SMALL);
        herbivoreAviary.addAnimal(butterfly.getName(), new Butterfly());

        Aviary<Herbivore> herbivoreAviary2 = new Aviary<>(AviarySize.LARGE);
        herbivoreAviary2.addAnimal(beaver.getName(), new Beaver());
        herbivoreAviary2.addAnimal(goat.getName(), new Goat());
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Животные, которым нужен маленький вольер:");
        Aviary<Animals>smallAviary = new Aviary<>(AviarySize.SMALL);
        smallAviary.addAnimal(butterfly.getName(), new Butterfly());
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Животные, которым нужен средний вольер:");
        Aviary<Animals>mediumAviary = new Aviary<>(AviarySize.MEDIUM);
        mediumAviary.addAnimal(fish.getName(), new Fish());
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Животные, которым нужен большой вольер:");
        Aviary<Animals>largeAviary = new Aviary<>(AviarySize.LARGE);
        largeAviary.addAnimal(duck.getName(), new Duck());
        largeAviary.addAnimal(beaver.getName(), new Beaver());
        largeAviary.addAnimal(goat.getName(), new Goat());
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Животные, которым нужен огромный вольер:");
        Aviary<Animals>hugeAviary = new Aviary<>(AviarySize.HUGE);
        hugeAviary.addAnimal(wolf.getName(), new Wolf());
        // hugeAviary.addAnimal(butterfly.getName(), new Butterfly());       // Пример ошибки компиляции при добавлении животного в вольер неподходящего размера.
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Удаление животных из вольера:");
        smallAviary.removeAnimal(butterfly.getName());
        mediumAviary.removeAnimal(fish.getName());
        largeAviary.removeAnimal(duck.getName());
        largeAviary.removeAnimal(beaver.getName());
        largeAviary.removeAnimal(goat.getName());
        hugeAviary.removeAnimal(wolf.getName());
        System.out.println("--------------------------------------------------------------------");

        try {
            worker.feed(beaver, grass3);
            worker.feed(beaver, meat1);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        try {
            worker.feed(butterfly, grass2);
            worker.feed(butterfly, meat2);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        try {
            worker.feed(duck, meat1);
            worker.feed(duck, grass3);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        try {
            worker.feed(fish, meat1);
            worker.feed(fish, grass2);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        try {
            worker.feed(goat, grass1);
            worker.feed(goat, meat2);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        try {
            worker.feed(wolf, meat2);
            worker.feed(wolf, grass3);
        } catch (WrongFoodException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
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
        System.out.println();

        butterfly.fly();
        System.out.println();

        duck.run();
        duck.fly();
        System.out.println();

        goat.run();
        System.out.println();

        wolf.run();
        System.out.println();

    }

}
