package asgmt2;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer {
	LinkedList<Integer> runsData = new LinkedList<Integer>();
	public ScoreAnalyzer() {}
	
	public void addRunsToList(int runs) {
		runsData.add(runs);
	}
	
	public float calcRunRate() {
		int sum = 0;
		float runrate;
		for(Integer runs : runsData)
			sum+=runs;
		runrate = (float)sum/50;
		return runrate;
	}
	
	public int lowestRunsScored() {
		return Collections.min(runsData);
	}
	
	public void displayRuns() {
		int count = 1;
		System.out.print("Runs Scored : ");
		for(Integer runs : runsData)
			System.out.print((count++) + "-" + runs + " ");
	}
}

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		ScoreAnalyzer sa = new ScoreAnalyzer();
		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#0.00");
		System.out.println("Enter runs");
		/*
		 * while(sc.hasNext()) { sa.addRunsToList(sc.nextInt()); }
		 */
		String string = sc.nextLine();
        String[] strArray = string.split(" ");
        for (String str : strArray) {
                sa.addRunsToList(Integer.parseInt(str));
        }
		sa.displayRuns();
		System.out.println("\nRunrate : "+f.format(sa.calcRunRate()));
		System.out.println("Lowest Runs : "+sa.lowestRunsScored());
		System.out.println("Count of players who batted: "+sa.runsData.size());
		sc.close();
	}

}
