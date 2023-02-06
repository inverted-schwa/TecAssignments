package day6;

public class MainBank {
	
	public static void main(String[] args) {
	SavingAccount sv = new SavingAccount();
	CurrentDetails cd = new CurrentDetails();
	
	sv.calculateInterest();
	sv.custDetails();
	
	cd.calculateInterest();
	cd.custDetails();
	}
}
