package asgmt4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("E:\\Java Practice\\TopProverbs.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		 int i;    
		 while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		 }    
		 bin.close();    
		 fin.close();  
	}

}
