package asgmt3;

import java.util.Scanner;

interface Rewardable {
	public double calculateRewardPoints(double amount);
}

abstract class PrepaidCard {
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	public abstract boolean swipeCard(double amount);

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + 
				", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	public double rechargeCard(double amount) {
		availableBalance += amount;
		return availableBalance;
	}
	
}

class TravelCard extends PrepaidCard implements Rewardable{
	double rewardPoints;

	@Override
	public double calculateRewardPoints(double amount) {
		// TODO Auto-generated method stub
		double rupees = amount * 60;
		rewardPoints = rupees/20;
		return rewardPoints;
	}

	@Override
	public boolean swipeCard(double amount) {
		// TODO Auto-generated method stub
		double rupees = amount * 60;
		if(rupees > availableBalance || rupees > swipeLimit) {
			return false;
		}
		double processingCharge = rupees*0.05;
		availableBalance -= (rupees+processingCharge);
		return true;
	}
	
}

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double amount;
		TravelCard tc1 = new TravelCard();
		tc1.availableBalance = 10000;
		tc1.swipeLimit = 7500;
		System.out.println("Enter the amount you want to swipe($) : ");
		amount = sc.nextDouble();
		boolean approved = tc1.swipeCard(amount);
		if(!approved) {
			System.out.println("Entered amount is more than swipe limit or balance.");
			return;
		}
		
		System.out.println("Successfully swiped.\nAvailable Balance : "+tc1.availableBalance+
				"\nReward Points : "+tc1.calculateRewardPoints(amount));
		sc.close();
	}

}
