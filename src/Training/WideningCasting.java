package Training;

public class WideningCasting {

	public static void main(String[] args) {
		
		
		
		int myInt=9;
		double myDouble=myInt;// Automatic casting: int to double

		System.out.println(myInt);// Outputs 9
		System.out.println(myDouble);// Outputs 9.0

		int x = 50;
		int y = 40;
		
		
		/*x += 20;
		System.out.println(x);
		x -=30;
		System.out.println(x); */
		
		System.out.println(x <= y);
		
	}
}
