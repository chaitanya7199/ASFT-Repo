package asgmt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class States {

	public static void main(String[] args) {
		LinkedHashSet<String> states = new LinkedHashSet<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\chaithanya\\git"
					+ "\\axis-bank-repo\\Assignments\\AsgmtM10Collections\\asgmt6\\states.txt"));
			String state;
			while((state = br.readLine()) != null) {
				states.add(state);
			}
			System.out.println("Total number of states in states.txt : "+states.size());
			states.remove("Delhi");
			System.out.println("\nStates starting with 'K' are : ");
			for(String s : states) {
				if(s.startsWith("K"))
					System.out.println(s);
			}
			System.out.println("\nAfter Sorting : ");
			TreeSet<String> ts = new TreeSet<String>();
			ts.addAll(states);
			for(String s1 : ts)
				System.out.println(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
