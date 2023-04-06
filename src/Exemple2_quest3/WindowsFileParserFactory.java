package Exemple2_quest3;

public class WindowsFileParserFactory implements FileParserFactory{
	 @Override
	    public FileNameParser createFileNameParser() {
	        return new WindowsFileNameParser();
	    }

	  @Override
	  public CountFolders createFolderCounter() {
	        return new WindowsFolderCounter();
	  }

}
