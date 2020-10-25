package asgmt1;

class Address {
	
	private String addressLine;
	private String city;
	
	public Address() {}
	
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddressDetails() {
		return this.addressLine+", "+this.city;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	
	
}

class Customer {
	
	private String customerName;
	private Address residentialAddress = new Address();
	
	public Customer() {}
	
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public String getCustomerDetails() {
		return "Customer : "+this.customerName+"\nResidential Address : "+residentialAddress.getAddressDetails();
	}
}

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		customer1.setCustomerName("Chaitanya");
		customer1.setResidentialAddress(new Address("Kannaiah Naidu Colony", "Chittoor"));
		System.out.println("Customer1 :");
		System.out.println("Customer : "+customer1.getCustomerName());
		System.out.println("Residential Address : "+customer1.getResidentialAddress());
		
		System.out.println("\nCustomer2 :");
		Customer customer2 = new Customer("John", new Address("Ist Main HSR Layout", "Bangalore"));
		System.out.println(customer2.getCustomerDetails());
	}

}
