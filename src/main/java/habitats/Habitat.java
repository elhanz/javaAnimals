package habitats;


import abstract_classes.Animal;
import interfaces.Moveable;

import java.util.ArrayList;

public class Habitat {

    Moveable moveable;

    public Habitat(Moveable moveable) {
        this.moveable = moveable;
    }

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

    public void add(Animal animal){
        animals.add(animal);
    }

}
