package asgmt7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCar {

	public static void main(String[] args) throws Exception, IOException {
		Car car1 = new Car("AP 03 BL 1234", "Ford", new Engine("E101",1000));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cardata.ser"));
		oos.writeObject(car1);
	}

}
