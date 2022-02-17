package Practice;

public class IfConditionExcercise {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
				
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("y is greater than x");
		}
		if(x>=10)
		{
			System.out.println("x is greater");
		}
		if(x==y)
		{
			System.out.println("invalid entry");
		}
		else
		{
			System.out.println("Valid entry");
		}
		if(x!=y)
		{
			System.out.println("you welcome");
		}
		else
		{
			System.out.println("thank you");
		}
		int time =20;
		String result =(time >=18)?"Good day.":"Good evening.";
		System.out.println(result);
		//if elseif practice
		
	}

}
