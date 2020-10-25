package asgmt1;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\Java Practice\\Badminton");
		f1.mkdir();
		File f2 = new File(f1, "singles.txt");
		f2.createNewFile();
		File f3 = new File(f1, "dubbles.txt");
		f3.createNewFile();
		File f4 = new File(f1, "courts");
		f4.mkdir();
		File f5 = new File(f4, "smash.dat");
		f5.createNewFile();
		
		 File f6 = new File(f1,"doubles.txt"); 
		 if(f3.renameTo(f6))
			 System.out.println("Renamed Successfully"); 
		 else
			 System.out.println("Renaming failed."); 
		 if(f2.delete())
			 System.out.println("File deleted successfully."); 
		 else
			 System.out.println("File deletion failed");
	}

}
