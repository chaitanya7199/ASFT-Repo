package asgmt6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name for storing data from client file : ");
		String fileName = sc.nextLine();
		File file = new File("E:\\Java Practice\\"+fileName+".txt");
		file.createNewFile();
		FileReader fr = new FileReader("E:\\Java Practice\\asgmt6.txt");
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(file);
		String line;
		while((line = br.readLine())!=null) {
			line = line.replaceAll("\\s+", " ");
			pw.println(line);
		}
		br.close();
		pw.close();
		sc.close();
	}

}
