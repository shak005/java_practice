package filehandling;
import java.io.*;

public class FileReader1 {
	public static void main(String[] args) throws IOException{
		FileReader f = new FileReader("E:\\new.txt");
		int ch;
		while((ch=f.read())!=-1) {
			System.out.println((char)ch);
		}
	}
}