package filehandling;
import java.io.*;

public class FileWriter1 {
	public static void main(String[] args) throws IOException{
		FileWriter w = new FileWriter("E:\\new.txt",true);
		w.write("File Handling\n");
		w.write("File Writer\n");
		w.close();
	}
}
