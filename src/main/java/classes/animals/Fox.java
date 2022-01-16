package classes.animals;

import abstract_classes.Animal;
import interfaces.Walkable;

public class Fox extends Animal implements Walkable {
    public Fox(int size) {
        super(size);
    }

    public  boolean Walk(){
        return Walkable.walk;
    }
    public  boolean Fly(){
        return Walkable.fly;
    }
    public  boolean Swim(){
        return Walkable.swim;
    }
}
