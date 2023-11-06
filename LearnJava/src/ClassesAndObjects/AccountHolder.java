package ClassesAndObjects;

public class AccountHolder {
	String firstName;
	 String lastName;
	 int age;
	 double accBalance;
	boolean eligibleForCreditCard;
	
	public void testeligibilityForCreditCard () {
		if (age>25 && accBalance>=20000) {
			eligibleForCreditCard =true;
		}
	}

}
