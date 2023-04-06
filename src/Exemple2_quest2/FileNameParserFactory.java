package Exemple2_quest2;

public class FileNameParserFactory {
    public static FileNameParser createFileNameParser(String path) {
        if (path.startsWith("c:\\")) {
            return new WindowsFileNameParser();
        } else {
            return new LinuxFileNameParser();
        }
    }
}