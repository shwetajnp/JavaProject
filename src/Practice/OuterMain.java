package Practice;

import Practice.OuterClass1.Innerclass1;

public class OuterMain {

	public static void main(String[] args) {
		 OuterClass1 myouter= new OuterClass1();
		 Innerclass1 MyInner= myouter.new Innerclass1();
		 System.out.println(MyInner.y + myouter.x);

	}

}
