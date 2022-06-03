package command;

import board.MagicBoard;
import toy.ToyType;

public class NeedDollsCommand implements Command{
    private final MagicBoard magicBoard;

    public NeedDollsCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.notifyForChange(ToyType.DOLL);
    }
}
