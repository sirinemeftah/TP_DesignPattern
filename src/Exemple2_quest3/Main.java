package Exemple2_quest3;

public class Main {
    public static void main(String[] args) {
    	String windowsPath = "C:\\Program Files\\test.txt";
        String linuxPath = "/usr/share/test.txt";
        
        
        FileParserFactory factory1 = new WindowsFileParserFactory();
        FileParserFactory factory2  = new LinuxFileParserFactory();
   
        
        FileNameParser parser1 = factory1.createFileNameParser();
        CountFolders counter1 = factory1.createFolderCounter();
        
        FileNameParser parser2 = factory2.createFileNameParser();
        CountFolders counter2 = factory2.createFolderCounter();
        
        String fileName = parser1.parseFileName(windowsPath);
        int folders = counter1.countFolders(windowsPath);
        System.out.println("Windows file name: " + fileName);
        System.out.println("Windows folder count: " + folders);
        
        fileName = parser2.parseFileName(linuxPath);
        folders = counter2.countFolders(linuxPath);
        System.out.println("Linux file name: " + fileName);
        System.out.println("Linux folder count: " + folders);
    }
}
  