package Practice;


import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		HashSet<String> set1= new HashSet<String>();
		
		set1.add("Jan");
		set1.add("Feb");
		set1.add("Mar");
		set1.add("Apr");
		set1.add("May");
		set1.add("Jun");
		
		 //System.out.println("-----------------");
		 
		 Iterator it1 = set1.iterator();
		 while(it1.hasNext()) {
			 String obj= (String)it1.next();
			 System.out.println(obj);
			 }
	}

}
