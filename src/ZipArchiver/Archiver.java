package ZipArchiver;

import ZipArchiver.exception.WrongZipFileException;

import java.io.IOException;

public class Archiver {
    public static void main(String[] args) throws IOException {

        Operation operation = null;
        do {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("You select wrong file.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Error has been occurred. Try again.");
            }

        } while (operation != Operation.EXIT);
    }


    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Choose and enter the number of operation:");
        ConsoleHelper.writeMessage(String.format("\t %d - create new archive", Operation.CREATE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - add file to the existing archive", Operation.ADD.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - delete file from the archive", Operation.REMOVE.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - extract archive", Operation.EXTRACT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - view the contents of the archive", Operation.CONTENT.ordinal()));
        ConsoleHelper.writeMessage(String.format("\t %d - exit", Operation.EXIT.ordinal()));

        return Operation.values()[ConsoleHelper.readInt()];
    }
}