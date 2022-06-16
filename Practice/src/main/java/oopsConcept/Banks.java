package oopsConcept;

public class Banks implements SEBI {

	public void Accountopen() {
		System.out.println("to open Account");
	}
	public void Deposit() {
		System.out.println("To deposit ");
		
	}
	
	public void Transfer() {
		

	System.out.println("To Transfer the Deposit Amount");	
	}
	
	public void Tradeaccount() {
		System.out.println("Must have Trading account");
	}
	
public static void main(String[] args) {
	Banks chdcls = new Banks();
	chdcls.Accountopen();
	chdcls.Deposit();
	chdcls.Transfer();
	chdcls.Tradeaccount();
}
}
