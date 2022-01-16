package classes.birds;

import abstract_classes.Bird;
import interfaces.Flyable;
import interfaces.Walkable;

public class Sparrow extends Bird implements Walkable, Flyable {
    public Sparrow(int size) {
        super(size);
    }
    public  boolean Walk(){
        return Walkable.walk;
    }
    public  boolean Fly(){
        return Flyable.fly;
    }
    public  boolean Swim(){
        return Walkable.swim;
    }
}
