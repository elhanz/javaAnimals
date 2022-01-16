package habitats;



import abstract_classes.Animal;
import interfaces.Moveable;
import interfaces.Walkable;

import java.util.ArrayList;

public class Cage extends Habitat {

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

    private Walkable walkable;
    public Cage(Moveable moveable, Walkable walkable) {
        super(moveable);
        this.walkable = walkable;
    }
    @Override
    public void add(Animal animal) {
        if(animal.getComfortableSpace() <= size){
            if(animal.Fly()==false && animal.Swim() == true && animal.Walk()==false){
                super.add(animal);
                System.out.println("Animal was added");
            }else{
                System.out.println("The environment is not suitable for the animal");
            }
        }else{
            System.out.println("The environment is not suitable for the animal");
        }

    }
}
