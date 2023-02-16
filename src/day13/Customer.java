package day13;

public class Customer implements PersonalInterface {

	@Override
	public void acceptName() {
		System.out.println("Accepting name of customer");
	}
	
	@Override
	public void acceptAddress() {
		System.out.println("Accepting address of customer");
	}
	
	@Override
	public void acceptMobile() {
		System.out.println("Accepting mobile for customer");
	}
}
