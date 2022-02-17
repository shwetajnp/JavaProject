package Practice;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.get(2));
		cars.remove("Mazda");
		System.out.println(cars);
		cars.set(2, "Camry");
		System.out.println(cars);
		cars.addFirst("Lamborghini");
		cars.addLast("Tesla");
		System.out.println(cars);
		

	}

}
