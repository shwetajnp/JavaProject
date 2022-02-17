package Practice;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");
		
		System.out.println(map.get(2));
		map.put(4, "Dec");
		map.remove(4);
		System.out.println(map);

	}

}
