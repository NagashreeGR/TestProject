package ClassesAndObjects;

public class exceptionHandlingDemo {
	public static void main(String[] args) {
		demo();
	}
	public static void demo() {
		try {
			System.out.println("Helloworld...!");
			int i=1/0;
			System.out.println("Completed");
			}
			catch(Exception e){
				System.out.println("I am inside the catch block");
				System.out.println("The messae is:" +e.getMessage());
				System.out.println("The cause :"+e.getCause());
				e.printStackTrace();
				
			}
			finally {
				System.out.println("I am inside the finally  block");
			}
	}
}
