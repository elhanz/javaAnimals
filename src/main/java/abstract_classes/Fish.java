package abstract_classes;


import interfaces.Swimable;

abstract public class Fish extends Animal implements Swimable {
    public Fish(int size) {
        super(size);
    }
}
