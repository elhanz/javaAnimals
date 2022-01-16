package habitats;

import abstract_classes.Animal;
import interfaces.Flyable;
import interfaces.Moveable;

import java.util.ArrayList;

public class Cell extends Habitat{
    private Flyable flyable;
    private int size;

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    public Cell(Moveable moveable, Flyable flyable) {
        super(moveable);
        this.flyable = flyable;
    }

    @Override
    public void add(Animal animal) {
        super.add(animal);
    }
}
