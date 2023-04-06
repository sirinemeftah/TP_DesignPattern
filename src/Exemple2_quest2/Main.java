package Exemple2_quest2;

public class Main {
    public static void main(String[] args) {
        String path = "c:\\\\Windows\\\\hello.dll";
        FileNameParser parser = FileNameParserFactory.createFileNameParser(path);
        String fileName = parser.parseFileName(path);
        System.out.println(fileName);
    }
}