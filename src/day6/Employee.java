package day6;

public class Employee implements PersonalDetails,EducationalDetails {

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		System.out.println("Accepting employee details");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Employee Details ");
		
	}

	@Override
	public void gradDetails() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Graduation Details ");

	}

	@Override
	public void postGradDetails() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Postgrad Details ");

	}
	
	
}
