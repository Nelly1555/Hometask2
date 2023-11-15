package ZOO.Animals;
import ZOO.Aviary.AviarySize;
import ZOO.Exception.WrongFoodException;
import ZOO.Food.Food;

import java.util.Objects;


public abstract class Animals {

    private String name;
    private AviarySize size;


    public Animals (String name, AviarySize size) {
        this.name = name;
        this.size = size;
    }

    public Animals() {

    }

    public AviarySize getSize() {

        return size;

    }

    public abstract void eat(Food food) throws WrongFoodException;

    public String voice() {

        return null;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animal = (Animals) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);

    }

}
