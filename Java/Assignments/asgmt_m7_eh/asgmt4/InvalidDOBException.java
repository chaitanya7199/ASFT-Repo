package asgmt4;

public class InvalidDOBException extends Exception{

	public InvalidDOBException() {}	

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Date of Birth cannot be after current date";
	}
	
	
}
