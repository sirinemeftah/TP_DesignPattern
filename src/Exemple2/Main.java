package Exemple2;


public class Main {
	public static void parse_filename(String path)
	{
	int index = path.lastIndexOf("\\");
	String r = path.substring(index+1);
	System.out.println(r);
	}
	/* ********* question 1******
	public static void main(String[] args) {
		parse_filename("« C:\\\\Windows\\\\hello.dll");
	}
	-----> on obtient comme sortie hello.dll
	*/
}
