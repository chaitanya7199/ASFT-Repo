package asgmt8;

import java.io.File;
import java.util.Scanner;

class FileExplorer {
	
	public void listAll(String path) {
		File f = new File(path);
		if(!f.exists()) {
			System.out.println("File/Folder does not exists. Enter a valid folder.");
			return;
		}
		String[] files = f.list();
		for(String file : files) {
			File f1 = new File(f,file);
			if(f1.isFile())
				System.out.println(f1.getName());
			
			  if(f1.isDirectory()) { 
				  System.out.println(f1.getName()); 
				  String fileName = f1.getAbsolutePath(); 
				  listAll(fileName); 
			  }
			 
		}
	}
	
}

public class TestFileExplorer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of directory you want to work with : ");
		String path = sc.nextLine();
		FileExplorer fe = new FileExplorer();
		fe.listAll(path);
	}

}
