package ZOO.Animals;

import ZOO.Food.Food;
import ZOO.Food.Meat;

public class Wolf extends Carnivorous implements Run, Swim, Voice {

    private String name;
    private String color;
    private int satiety;

    public Wolf (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    @Override
    public void run() {

        System.out.println(color + " " + name + " бегает по вольеру.");
        int tiredness = 10;
        satiety = satiety - tiredness;
        System.out.println("Теперь его сытость " + satiety + "%.");

    }

    @Override
    public void swim() {

        System.out.println(name + " плавает в пруду.");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь его сытость " + satiety + "%.");

    }

    @Override
    public String voice() {

        return name + " говорит: \"Ууу!\"";

    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {
            int countOfSatiety = 50;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " набрасывается на еду! Его сытость увеличилась на " + countOfSatiety + "%! Теперь его запас сытости - " + satiety + "%!");
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
