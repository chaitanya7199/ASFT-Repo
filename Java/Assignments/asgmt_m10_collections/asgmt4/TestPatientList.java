package asgmt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class Patient implements Comparable<Object> {
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
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		String name1 = this.name;
		Patient p = (Patient)o;
		String name2 = p.name;
		return name1.compareTo(name2);
	}	
	
	
	
	public static int getPatientAge(String patientName, TreeSet<Patient> patients) {
		int age = 0;
		for(Patient p : patients) {
			if(p.getName().equals(patientName)) {
				return p.age;
			}
		}
		return age;
	}
	
}

class SortByAge implements Comparator<Patient> {

	public int compare(Patient p1, Patient p2) {
		int age1 = p1.getAge();
		int age2 = p2.getAge();
		if(age1 < age2) 
			return -1;
		else if(age1 > age2)
			return +1;
		return 0;
	}
	
}

public class TestPatientList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> patients = new ArrayList<Patient>();
		Patient p1 = new Patient(101, "ram" , 21);
		Patient p2 = new Patient(102, "gopi" , 40);
		Patient p3 = new Patient(103, "sundar" , 15);
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		for(Patient patient : patients)
			System.out.println(patient);
		Collections.sort(patients, new SortByAge());
		Iterator<Patient> i = patients.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		TreeSet<Patient> ts1 = new TreeSet<Patient>();
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		for(Patient patient : ts1)
			System.out.println(patient);
		System.out.println("Enter the name of the patient to get the age : ");
		String patientName = sc.nextLine();
		int age = Patient.getPatientAge(patientName, ts1);
		System.out.println(age==0 ? "No such patient" : age);
		sc.close();
	}

}
