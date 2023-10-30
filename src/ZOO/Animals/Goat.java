package ZOO.Animals;

import ZOO.Aviary.AviarySize;
import ZOO.Exception.WrongFoodException;
import ZOO.Food.Food;
import ZOO.Food.Grass;

import java.util.Objects;

public class Goat extends Herbivore implements Run, Swim, Voice {

    private String name;
    private String color;
    private final AviarySize size = AviarySize.LARGE;
    private int satiety;

    public Goat (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    public Goat() {

    }

    @Override
    public void run() {

        System.out.println(color + " " + name + " скачет по вольеру");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void swim() {

        System.out.println(color + " " + name + " плавает в пруду.");
        int tiredness = 20;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public String voice() {

        return name + " говорит: \"Меее!\"";

    }

    @Override
    public void eat(Food food) throws WrongFoodException {

        if (food instanceof Grass) {

            int countOfSatiety = 25;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " щиплет еду. Её сытость увеличилась на " + countOfSatiety + "%! Теперь её запас сытости - " + satiety + "%!");
            }

        } else {
            throw new WrongFoodException("Животное не ест мясо!");
        }

    }


    public String getName() {

        return name;

    }

    public String getColor() {

        return color;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public int getSatiety() {

        return satiety;

    }

    public void setSatiety(int satiety) {

        this.satiety = satiety;

    }

    public AviarySize getSize() {

        return size;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goat goat = (Goat) obj;
        return Objects.equals(name, goat.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }
}
