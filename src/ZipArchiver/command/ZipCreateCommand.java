package ZipArchiver.command;

import ZipArchiver.*;
import ZipArchiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Archive creation.");

            ZipFileManager zipFileManager = getZipFileManager();
            ConsoleHelper.writeMessage("Enter the full path of the file or directory for archiving:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.createZip(sourcePath);

            ConsoleHelper.writeMessage("Archive has been created.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("The path of the directory or file is wrong.");
        }
    }
}
