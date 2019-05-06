package ZipArchiver.command;

import ZipArchiver.ConsoleHelper;
import ZipArchiver.ZipFileManager;
import ZipArchiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Archive extracting.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the path for extracting:");
            Path destinationPath = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(destinationPath);

            ConsoleHelper.writeMessage("Archive has been extracted.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Wrong path for extracting.");
        }
    }
}
