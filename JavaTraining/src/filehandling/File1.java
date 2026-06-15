package filehandling;

import java.io.*;

public class File1 {
	public static void main(String [] args) throws IOException{
	File f=new File("E:\\new.txt");
	if(!f.exists()) {
		if(f.createNewFile()) {
			System.out.println("File Created");
		}else {
			System.out.println("File is not created");
		}
	}
	else {
		System.out.println("File already exists");
		f.delete();
	}
	System.out.println(f.getName());
	System.out.println(f.getAbsoluteFile());
	}
}