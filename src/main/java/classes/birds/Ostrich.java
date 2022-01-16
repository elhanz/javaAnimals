package classes.birds;

import abstract_classes.Bird;
import interfaces.Walkable;

public class Ostrich extends Bird implements Walkable {
    public Ostrich(int size) {
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
