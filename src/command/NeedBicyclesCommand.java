package command;

import board.MagicBoard;
import toy.ToyType;

public class NeedBicyclesCommand implements Command {
    private final MagicBoard magicBoard;

    public NeedBicyclesCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.notifyForChange(ToyType.BICYCLE);
    }
}
