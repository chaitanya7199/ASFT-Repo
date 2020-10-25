package asgmt7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeCar {

	public static void main(String[] args) throws Exception, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cardata.ser"));
		Car car2 = (Car)ois.readObject();
		System.out.println(car2.getRegistrationNo()+"\t"+car2.getCarMake()+"\t"+car2.getEngine());
	}

}
