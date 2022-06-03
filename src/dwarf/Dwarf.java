package dwarf;

import board.MagicBoard;
import factory.Workshop;
import santa.Santa;
import toy.Toy;
import toy.ToyType;

public class Dwarf implements Observer {
    private final MagicBoard board;
    private final Workshop workshop;


    public Dwarf(MagicBoard board, Workshop workshop) {
        this.board = board;
        this.workshop = workshop;
    }


    @Override
    public void update() {
        ToyType toyType = board.getToyType();
        Toy toy = workshop.getToy(toyType);
        Santa santa = Santa.getInstance();
        santa.receiveToy(toy);
    }
}
