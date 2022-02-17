package Practice;

public class ExceptionEx {

	static void checkAge(int age) {
		if (age<20) {
			throw new ArithmeticException("Access Denied- You must be atleast 18 years old");
		}
		else {
			System.out.println("Access granted- You are old enough");
		}
	}
	public static void main(String[] args) {
		checkAge(18);
		
	}

}
