package ZipArchiver.command;

import ZipArchiver.ConsoleHelper;
import ZipArchiver.FileProperties;
import ZipArchiver.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("View archive contents.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Archive contents:");

        List<FileProperties> files = zipFileManager.getFilesList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Archive content is displayed.");
    }
}
