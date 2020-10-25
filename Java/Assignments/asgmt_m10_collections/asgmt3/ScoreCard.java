package asgmt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ScoreCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter Runs Scored");
		String string = sc.nextLine();
		string = string.replaceAll("-", " ");
		String[] strArray = string.split(" ");
		
		Map<String, Integer> scoreCard = new HashMap<String, Integer>();
		for(int i=0; i<strArray.length; i+=2) {
			scoreCard.put(strArray[i], Integer.parseInt(strArray[i+1]));
		}
		
		System.out.println("\nPlayers who batted");
		Set<String> playersSet = scoreCard.keySet();
		ArrayList<String> players = new ArrayList<String>();
		players.addAll(playersSet);
		Collections.sort(players);
		for(String player : players)
			System.out.println(player);
		
		System.out.println("\nScores by players");
		String playerWithHighestScore = "";
		int max = 0, sum = 0;
		for(String player : players) {
			int score = scoreCard.get(player);
			System.out.println(player+" : "+ score);
			sum += score;
			if(max < scoreCard.get(player)) {
				max = score;
				playerWithHighestScore = player;
			}
		}
		
		System.out.println("\nTotal Score : "+sum);
		
		System.out.println("\nName of Highest Scorer : "+ playerWithHighestScore);
		
		System.out.println("\nRuns Scored by Dhoni : "+scoreCard.get("Dhoni"));
		
		sc.close();
	}

}
