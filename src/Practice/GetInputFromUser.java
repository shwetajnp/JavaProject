package Practice;
import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("You entered string " );
		String s = input.nextLine();
		
		
		System.out.println("You entered integer " );
		int a = input.nextInt();
		
		System.out.println("You entered float " );
		float b = input.nextFloat();
		
		System.out.println("String is  " +s);
		System.out.println("Integar is " +a);
		System.out.println("Float is   " +b);
		
		
		
	}

}
