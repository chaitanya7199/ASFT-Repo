package asgmt9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class ImageCopy {
	public static boolean copyImage(File file) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		String newFile = file+"_copy.jpeg";
		File f = new File(newFile);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f,true));
		int i;
		while((i=bis.read())!=-1) {
			bos.write((char)i);
			bos.flush();
		}
		if(i==-1)
			return true;
		bis.close();
		bos.close();
		return false;
	}
}

public class TestImageCopy {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter path of the image file : ");
		String path = sc.nextLine();
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("File not Found");
		}
		String extension = "";
		int i = path.lastIndexOf('.');
		if (i > 0) {
		    extension = path.substring(i+1);
		}
		if(!(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg"))) {
			System.out.println("File format not supported");
			return;
		}
	    System.out.println(ImageCopy.copyImage(file) ? 
	    		          "Image copied Successfully" : 
	    		          "Image copied Unsuccessful");
	    sc.close();
	}

}
