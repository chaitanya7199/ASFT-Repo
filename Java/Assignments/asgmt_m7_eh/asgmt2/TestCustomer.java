package asgmt2;

import java.util.Scanner;

class Customer {
	
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo, String custName, String category) throws InvalidInputException {
		if(custNo.startsWith("C") || custNo.startsWith("c"))
			this.custNo = custNo;
		else
			throw new InvalidInputException("Invalid Input!\nCustomer number should start with c or C");
		if(custName.length() < 4)
			throw new InvalidInputException("Invalid Input!\\nCustomer name should be atleast of length 4");
		this.custName = custName;
		if(!(category=="Platinum" || category=="Gold" || category == "Silver"))
			throw new InvalidInputException("Invalid Input!\\n"
					                      + "Category should be one of the following:\n"
					                      + "1. Platinum\n"
					                      + "2. Gold\n"
					                      + "3. Silver");
		this.category = category;
	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}
	
	
	
	
}

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer number : ");
		String custNo = sc.nextLine();
		System.out.println("Enter customer name : ");
		String custName = sc.nextLine();
		System.out.println("Enter category : ");
		String category = sc.nextLine();
		try {
			Customer c = new Customer(custNo, custName, category);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
