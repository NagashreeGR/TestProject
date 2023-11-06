package ClassesAndObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		 AccountHolder tom =new AccountHolder();
		 AccountHolder henry =new AccountHolder();
		 AccountHolder sarah =new AccountHolder();
		 
		 tom.firstName = "Tom";
		 tom.lastName ="Smith";
		 tom.age= 21;
		 tom.accBalance =10000;
		 tom.testeligibilityForCreditCard();
		 System.out.println("Is Tom eligible for Credit Card: "+ tom.eligibleForCreditCard);
		 

		 henry.firstName = "henry";
		 henry.lastName ="Hill";
		 henry.age= 31;
		 henry.accBalance =25000;
		 henry.testeligibilityForCreditCard();
		 System.out.println("Is Henry eligible for Credit Card: "+ henry.eligibleForCreditCard);
		 
		 sarah.firstName = "sarah";
		 sarah.lastName ="Miller";
		 sarah.age= 41;
		 sarah.accBalance =30000;
		 sarah.testeligibilityForCreditCard();
		 System.out.println("Is sarah eligible for Credit Card: "+ sarah.eligibleForCreditCard);
	}

}
