package ZOO.Animals;

import ZOO.Food.Food;
import ZOO.Food.Meat;

public class Duck extends Carnivorous implements Run, Swim, Voice, Fly {

    private String name;
    private String color;
    private int satiety;

    public Duck (String name, String color) {

        this.name = name;
        this.color = color;
        this.satiety = 0;

    }

    @Override
    public void run() {

        System.out.println(name + " бегает по берегу.");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void swim() {

        System.out.println(name + " плавает в пруду.");
        int tiredness = 30;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public String voice() {

        return name + " говорит: \"Кря-кря!\"";

    }

    @Override
    public void fly() {

        System.out.println(name + " летает кругами.");
        int tiredness = 15;
        satiety = satiety - tiredness;
        System.out.println("Теперь её сытость " + satiety + "%.");

    }

    @Override
    public void eat(Food food) {

        if (food instanceof Meat) {

            int countOfSatiety = 25;
            while (satiety < 100) {
                satiety = satiety + countOfSatiety;
                System.out.println(name + " подбегает за едой. Её сытость увеличилась на " + countOfSatiety + "%! Теперь её запас сытости - " + satiety + "%!");
            }

        } else {
            System.out.println(name + " не хочет есть растительную пищу!");
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
