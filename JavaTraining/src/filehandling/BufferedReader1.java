package filehandling;
import java.io.*;

public class BufferedReader1 {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("E:\\new.txt"));
		String l;
		while((l=f.readLine())!=null) {
			String[] word = l.split(" ");
			for(String a:word) {
				System.out.println(a);
			}
		}
	}
}