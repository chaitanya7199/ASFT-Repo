package day4;

public class answer15 {
	public static void main(String[] args) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				if(i%2==0)
				  System.out.print("*");
				else 
				  System.out.print("#");
			}
			System.out.println();
		}
	}
}
