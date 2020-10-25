package asgmt5;

import java.util.LinkedHashSet;

class Patient {
	
	private int patientId;
	private String name;
	private int age;
	
	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + patientId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patientId != other.patientId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class TestPatientSet {

	public static void main(String[] args) {
		LinkedHashSet<Patient> patients = new LinkedHashSet<Patient>();
		Patient p1 = new Patient(101, "ram" , 21);
		Patient p2 = new Patient(102, "gopi" , 40);
		Patient p3 = new Patient(101, "ram" , 21);
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		System.out.println("Size of the set is "+patients.size());
		for(Patient patient : patients)
			System.out.println(patient);
	}

}
