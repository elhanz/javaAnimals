import abstract_classes.Animal;
import classes.animals.Fox;
import classes.birds.Penguin;
import classes.fishes.Shark;
import habitats.Aquarium;
import habitats.Cage;
import habitats.Cell;
import habitats.Habitat;
import interfaces.Moveable;

public class Main {

    public static void main(String[] args) {
        Animal fox = new Fox(3);
        Animal pin = new Penguin(2);
        Animal shark = new Shark(4);

        Habitat cell = new Cell(new Moveable() {
            @Override
            public int getComfortableSpace() {
                return 5;
            }
        }, 5);

        Habitat aqua = new Aquarium(new Moveable() {
            @Override
            public int getComfortableSpace() {
                return 10;
            }
        }, 10);
        Habitat cage = new Cage(new Moveable() {
            @Override
            public int getComfortableSpace() {
                return 5;
            }
        }, 5);
        System.out.println("1");
        aqua.add(shark);
        System.out.println("2");
        cell.add(pin);
        System.out.println("3");
        cage.add(fox);
        System.out.println("------------------");

    }
}
