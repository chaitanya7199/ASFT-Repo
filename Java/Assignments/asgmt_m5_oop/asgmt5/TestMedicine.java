package asgmt5;

import java.util.Date;

abstract class Medicine {
	float price;
	Date expiryDate;
	
	public abstract void displayLabel();
	
	public void getDetails() {
		System.out.println("Price : "+price+"\nExpiray Date : "+expiryDate); 
	}
}

class Tablet extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Store in a cool dry place.");
	}
}

class Syrup extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Close the cap properly after use.");
	}
}

class Ointment extends Medicine {

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("For external use only.");
	}}

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] medicines = new Medicine[5];
		int max = 3, min = 1, count = 0;
		for(int i=0;i<5;i++) {
			int randomNumber = (int)(Math.random() * ((max - min) + 1)) + min;
			if(randomNumber == 1) {
				Medicine m1 = new Tablet();
				medicines[count++] = m1;
			}
			else if(randomNumber == 2) {
				Medicine m2 = new Syrup();
				medicines[count++] = m2;
			}
			else if(randomNumber == 3) {
				Medicine m3 = new Ointment();
				medicines[count++] = m3;
			}
		}
		for(int i=0;i<5;i++)
			medicines[i].displayLabel();
	}
}
