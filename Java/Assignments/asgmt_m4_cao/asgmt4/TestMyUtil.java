package asgmt4;

import java.text.DecimalFormat;

class MyUtil {
	
	public static int throwDice() {
		int min = 1, max = 6;
		int range = (max - min) + 1; 
		int rand = 0;
		for(int i = 1; i <= 6; i++) { 
	        rand = (int)(Math.random() * range) + min;
		}
		return rand;
	}	
	
	public static float findAverage(int[] array) {
		int sum = 0;
		float avg = 0f;
		int size = array.length;
		for(int i=0;i<size;i++) {
			sum+=array[i];
		}
		avg = (float)(sum/size);
		return avg;
	}	
	
}

public class TestMyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Dice : "+MyUtil.throwDice());
		int[] input1 = {1,2,3,4,5};
		int[] input2 = {6,7,8,9,10};
		System.out.println("Average of first array is "+df.format(MyUtil.findAverage(input1)));
		System.out.println("Average of second array is "+df.format(MyUtil.findAverage(input2)));
		System.out.println("The maximum and minimum of 10.87 and 10.89 :");
		System.out.println("Max : "+Math.max(10.87, 10.89));
		System.out.println("Min : "+Math.min(10.87, 10.89));
		System.out.println("The ceiling, floor and round of 10.5 :");
		System.out.println("Ceiling : "+Math.ceil(10.5));
		System.out.println("Floor   : "+Math.floor(10.5));
		System.out.println("Round   : "+Math.round(10.5));
	}

}
