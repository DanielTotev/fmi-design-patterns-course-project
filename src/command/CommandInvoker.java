package command;

public class CommandInvoker {
    public void invokeCommand(Command command) {
        command.execute();
    }
}
