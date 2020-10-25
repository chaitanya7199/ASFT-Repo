package asgmt1;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		double[] array = new double[size];
		double sum = 0;
		for(int i=0;i<size;i++) {
			array[i] = Double.parseDouble(args[i+1]);
			sum+=array[i];
		}
		System.out.println(sum);
	}

}
