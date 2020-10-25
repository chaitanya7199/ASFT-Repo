package asgmt7;

import java.io.Serializable;

public class Car implements Serializable{
	private transient String registrationNo;
	private String carMake;
	private Engine engine;
	
	public Car(String registrationNo, String carMake, Engine engine) {
		super();
		this.registrationNo = registrationNo;
		this.carMake = carMake;
		this.engine = engine;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getEngine() {
		return engine.getEngineNo() +"\t"+ engine.getCubicCapacity();
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}	
	
}
