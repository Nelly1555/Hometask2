package ZOO.Animals;

import ZOO.Aviary.AviarySize;
import ZOO.Exception.WrongFoodException;
import ZOO.Food.Food;
import ZOO.Food.Grass;

import java.util.Objects;

public class Beaver extends Herbivore implements Run, Swim, Voice {

    private String name;
    private String color;
    private final AviarySize size = AviarySize.LARGE;
    private int satiety;



    public Beaver (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    public Beaver() {
        super();

    }

    @Override
    public void run() {

        System.out.println(color + " " + name + " бегает по вольеру");
        int tiredness = 10;
        satiety = satiety - tiredness;
        System.out.println("Теперь его сытость " + satiety + "%.");

    }

    @Override
    public void swim() {

        System.out.println(color + " " + name + " плавает в пруду.");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь его сытость " + satiety + "%.");

    }

    @Override
    public String voice() {

        return name + " говорит: \"Хррр-хррр!\"";

    }

    @Override
    public void eat(Food food) throws WrongFoodException {

            if (food instanceof Grass) {

                int countOfSatiety = 25;
                while (satiety < 100) {
                    satiety = satiety + countOfSatiety;
                    System.out.println(name + " довольно хрустит. Его сытость увеличилась на " + countOfSatiety + "%! Теперь его запас сытости - " + satiety + "%!");
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
        Beaver beaver = (Beaver) obj;
        return Objects.equals(name, beaver.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }

}
