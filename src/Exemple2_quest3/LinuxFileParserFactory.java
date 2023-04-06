package Exemple2_quest3;

public class LinuxFileParserFactory  implements FileParserFactory{
	@Override
    public FileNameParser createFileNameParser() {
        return new LinuxFileNameParser();
    }

    @Override
    public CountFolders createFolderCounter() {
        return new LinuxFolderCounter();
    }
}
