package ZOO.Animals;

import ZOO.Food.Food;
import ZOO.Food.Grass;

public class Goat extends Herbivore implements Run, Swim, Voice {

    private String name;
    private String color;
    private int satiety;

    public Goat (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    @Override
    public void run() {

        System.out.println(name + " скачет по вольеру");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void swim() {

        System.out.println(name + " плавает в пруду.");
        int tiredness = 20;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public String voice() {

        return name + " говорит: \"Меее!\"";

    }

    @Override
    public void eat(Food food) {

        if (food instanceof Grass) {

            int countOfSatiety = 25;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " щиплет еду. Её сытость увеличилась на " + countOfSatiety + "%! Теперь её запас сытости - " + satiety + "%!");
            }

        } else {
            System.out.println(name + " не ест мясо!");
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

}
