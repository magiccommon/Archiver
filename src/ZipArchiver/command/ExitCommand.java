package ZipArchiver.command;

import ZipArchiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Feel free to use me again.");
    }
}
