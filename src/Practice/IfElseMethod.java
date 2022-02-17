package Practice;
import java.util.Scanner; 

public class IfElseMethod {

	public static void EvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num +" is Even");
		}
		else
		{
			System.out.println(num + " is Odd");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number");
		
		int num =scan.nextInt();
		EvenOdd(num);
		

	}

}
