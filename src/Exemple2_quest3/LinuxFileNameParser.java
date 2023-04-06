package Exemple2_quest3;

public class LinuxFileNameParser implements FileNameParser {
    public String parseFileName(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(index + 1);
    }
}
