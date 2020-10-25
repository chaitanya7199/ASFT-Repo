package asgmt5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProverbReverser {
	
	public static String reverseWord(String word) {
		StringBuilder sb = new StringBuilder(word.trim());
		sb = sb.reverse();
		String rWord = sb.toString()+"\n";
		return rWord;
	}

	public static void main(String[] args) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("E:\\Java Practice\\TopProverbs.txt"));
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("E:\\Java Practice\\ReverseProverbs.txt",true));
		 int i;   
		 String word = "", rWord = "";
		 while((i=bin.read())!=-1) { 
			 if((char)i==' ') {
				 rWord = reverseWord(word);
				 bout.write(rWord.getBytes());
				 bout.flush();
				 word = "";
			 }		
			 word+=String.valueOf((char)i);
		 }
		 rWord = reverseWord(word);
		 bout.write(rWord.getBytes());
		 bout.flush();
		 	
		 bin.close();    
		 bout.close();
	}

}
