package asgmt3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {
	
	public static void storeProverb(String proverb) throws IOException {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("E:\\Java Practice\\TopProverbs.txt",true);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			byte b[]=proverb.getBytes();    
		    bout.write(b); 
		    bout.write("\n".getBytes());
		    bout.flush();    
		    bout.close();    
		    fout.close();    			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String choice = "CONTINUE";
		String proverb = "";
		File file = new File("E:\\Java Practice","TopProverbs.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		do {
			System.out.println("Enter a proverb : ");
			proverb = sc.nextLine();
			storeProverb(proverb);
			System.out.println("Type STOP if you want to stop or type c to continue : ");
			choice = sc.nextLine();
		} while(!choice.equalsIgnoreCase("STOP"));
		sc.close();
	}
}
