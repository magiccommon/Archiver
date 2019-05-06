package ZipArchiver.command;

import ZipArchiver.ConsoleHelper;
import ZipArchiver.ZipFileManager;
import ZipArchiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Adding new file to the archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the name of the file to add:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());

            zipFileManager.addFile(sourcePath);

            ConsoleHelper.writeMessage("Adding has been completed.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("File was not found.");
        }
    }
}
