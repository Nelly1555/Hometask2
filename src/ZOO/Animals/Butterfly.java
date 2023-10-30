package ZOO.Animals;

import ZOO.Food.Food;
import ZOO.Food.Grass;

public class Butterfly extends Herbivore implements Fly {

    private String name;
    private String color;
    private int satiety;

    public Butterfly (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    @Override
    public void fly() {

        System.out.println(name + " летает по инсектарию.");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void eat(Food food) {

        if (food instanceof Grass) {

            int countOfSatiety = 20;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " подлетает за едой. Её сытость увеличилась на " + countOfSatiety + "%! Теперь её запас сытости - " + satiety + "%!");
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
