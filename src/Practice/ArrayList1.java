package Practice;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Yellow");
		arr.add("Pink");
		arr.add("Black");
		arr.add("White");
		arr.add("Purple");
		arr.add("Brown");
		System.out.println(arr.get(0));
		System.out.println(arr.get(3));
		arr.set(3, "Pink");
		System.out.println(arr.get(3));
		
		
	}

}
