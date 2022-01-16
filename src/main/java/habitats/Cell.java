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

    public Cell(Moveable moveable, int size) {
        super(moveable);
        this.size = size;
    }

    @Override
    public void add(Animal animal) {
        if(animal.getComfortableSpace() <= size){
            if(animal.Fly()==true && animal.Swim() == false && animal.Walk()==true){
                super.add(animal);
                System.out.println("Animal was added");
            }else {
                System.out.println("The environment is not suitable for the animal");
            }
        }else{
            System.out.println("The environment is not suitable for the animal");
        }

    }
}
