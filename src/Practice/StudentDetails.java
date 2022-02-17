package Practice;

public class StudentDetails {

	public static void main(String[] args) {
		// Students Report Card
		String name="Pooja Gupta";
		int english=62;
		int maths=68;
		int science=78;
		int computer=82;
		int social=72;
		int total=english + maths + science + computer + social;
		int avg=total/5;
		
		System.out.println("Student Name      :-" +name);
		System.out.println("Marks obtained");
		System.out.println("English           :" +english);
		System.out.println("Maths             :" +maths);
		System.out.println("Science           :" +science);
		System.out.println("computer          :" +computer);
		System.out.println("Social            :" +social);
		System.out.println("Total Marks       :" +total);
		System.out.println("Average           :" +avg);
		System.out.println(avg > 50);
	}

}
