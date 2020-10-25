package day4;

public class answer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c = 1;
		for(i=0;i<7;i++) {
			for(j=0;j<=i;j++) {
				if(j<=i)
					System.out.print(j*c+" ");
			}
			c+=1;
			System.out.println();
		}
	}

}
