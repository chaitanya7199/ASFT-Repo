package day4;

public class answer6 {
	public static int[] fibanocci() {
		int a = -1;
		int b = 1;
		int[] result = new int[17];
		for(int i=0;i<17;i++) {
			result[i] = a+b;
			a = b;
			b = result[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] result = new int[17];
		result = fibanocci();
		int i,sum = 0;
		for(i=0;i<10;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
		for(i=0;i<17;i++) {
		    if(result[i]%2!=0)
			    System.out.print(result[i]+" ");
		}
		System.out.println();
		for(i=0;i<17;i++) {
			if(result[i]>100 && result[i]<1000)
			    System.out.print(result[i]+" ");
		}
		System.out.println();
		for(i=0;i<17;i++) {
			if(result[i]<100)
				sum+=result[i];
		}
		System.out.print(sum);
	}
}
