package asgmt7;

import java.io.Serializable;

public class Engine implements Serializable {
	
	private transient String engineNo;
	private int cubicCapacity;
	
	public Engine(String engineNo, int cubicCapacity) {
		super();
		this.engineNo = engineNo;
		this.cubicCapacity = cubicCapacity;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public int getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	
}
