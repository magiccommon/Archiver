package ZipArchiver.command;

import ZipArchiver.ConsoleHelper;
import ZipArchiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Deleting file from the archive.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Enter the file name:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);

        ConsoleHelper.writeMessage("Deleting has been completed.");
    }
}