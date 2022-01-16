package abstract_classes;


import interfaces.Flyable;

abstract public class Bird extends Animal implements Flyable {
    public Bird(int size) {
        super(size);
    }
}
