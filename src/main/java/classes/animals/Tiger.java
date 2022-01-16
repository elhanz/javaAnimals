package classes.animals;

import abstract_classes.Animal;
import interfaces.Walkable;

public class Tiger extends Animal implements Walkable {
    public Tiger(int size) {
        super(size);
    }
    @Override
    public  boolean Walk(){
        return Walkable.walk;
    }
    @Override
    public  boolean Fly(){
        return Walkable.fly;
    }
    @Override
    public  boolean Swim(){
        return Walkable.swim;
    }
}
