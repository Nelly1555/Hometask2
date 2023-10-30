package ZOO.Aviary;
import ZOO.Animals.Animals;

import java.util.HashMap;

public class Aviary<T extends Animals> {

    public AviarySize size;
    private HashMap<String, T> animals;

    public Aviary(AviarySize size) {
        this.animals = new HashMap<>();
        this.size = size;
    }

    public void addAnimal (String name, T animal) {
        if (animal.getSize() == size) {
            System.out.println(name + " помещается в вольер размера " + size + ".");
        } else {
            throw new IllegalArgumentException("Вольер не подходит животному!");
        }
        animals.put (name, animal);

    }

    public void removeAnimal (String name) {

        animals.remove(name);
        System.out.println("Животное по имени " + name + " удалено из вольера " + size + ".");

    }

    public T getAnimal (String name) {

        return animals.get (name);

    }

    public void setSize(AviarySize size) {

        this.size = size;

    }

}
