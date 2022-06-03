package santa;

import board.MagicBoard;
import command.Command;
import command.NeedBicyclesCommand;
import command.NeedDollsCommand;
import toy.Toy;

import java.util.ArrayList;
import java.util.List;

public final class Santa {
    private static Santa instance;

    private final List<Toy> toys = new ArrayList<>();

    private Santa() { }

    public static Santa getInstance() {
        if(instance == null) {
            instance = new Santa();
        }
        return instance;
    }

    public Command needDolls(MagicBoard board) {
        return new NeedDollsCommand(board);
    }

    public Command needBicycles(MagicBoard magicBoard) {
        return new NeedBicyclesCommand(magicBoard);
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void receiveToy(Toy toy) {
        toys.add(toy);
    }
}
