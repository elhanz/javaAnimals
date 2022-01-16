package abstract_classes;


import interfaces.Moveable;

abstract public class Animal implements Moveable {

    private final int size;

    public Animal(int size) {
        this.size = size;
    }

    @Override
    public int getComfortableSpace() {
       return size;
    }

    public abstract boolean Walk();

    public abstract boolean Fly();
    public abstract boolean Swim();
}
