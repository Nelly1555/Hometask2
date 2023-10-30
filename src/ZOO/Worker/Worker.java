package ZOO.Worker;

import ZOO.Animals.Animals;
import ZOO.Animals.Voice;
import ZOO.Exception.WrongFoodException;
import ZOO.Food.Food;

public class Worker {

    private String name;

    public Worker(String name) {

        this.name = name;

    }

    public void feed(Animals animals, Food food) throws WrongFoodException {

        animals.eat(food);

    }

    public void getVoice(Voice animals) {

        System.out.println(animals.voice());

    }


    public String getName () {

        return name;

    }

    public void setName (String name) {

        this.name = name;

    }

}


