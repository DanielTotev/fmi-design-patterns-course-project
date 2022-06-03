import board.MagicBoard;
import command.Command;
import command.CommandInvoker;
import dwarf.Dwarf;
import factory.Workshop;
import santa.Santa;

public class Main {
    public static void main(String[] args) {
        Santa santa = Santa.getInstance();
        Workshop workshop = new Workshop();
        MagicBoard magicBoard = new MagicBoard();

        Dwarf dwarf1 = new Dwarf(magicBoard, workshop);
        Dwarf dwarf2 = new Dwarf(magicBoard, workshop);
        Dwarf dwarf3 = new Dwarf(magicBoard, workshop);
        magicBoard.register(dwarf1);
        magicBoard.register(dwarf2);
        magicBoard.register(dwarf3);

        CommandInvoker commandInvoker = new CommandInvoker();
        Command needDolls = santa.needDolls(magicBoard);
        Command needBicycles = santa.needBicycles(magicBoard);

        commandInvoker.invokeCommand(needDolls);
        commandInvoker.invokeCommand(needBicycles);

        System.out.println(santa.getToys());
    }
}
