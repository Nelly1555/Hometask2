package ZOO.Animals;

import ZOO.Food.Food;
import ZOO.Food.Meat;

public class Fish extends Carnivorous implements Swim {

    private String name;
    private String color;
    private int satiety;

    public Fish (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    @Override
    public void swim() {

        System.out.println(name + " плавает в пруду.");
        int tiredness = 10;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {
            int countOfSatiety = 20;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " проглатывает еду. Её сытость увеличилась на " + countOfSatiety + "%! Теперь её запас сытости - " + satiety + "%!");
            }

        } else {
            System.out.println(name + " не ест растительную пищу!");
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
