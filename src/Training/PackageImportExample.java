package Training;


import java.time.*;

import java.util.Scanner;

public class PackageImportExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		
		String name = input.nextLine();
		
		System.out.println("Your Name is : " +name);
		
		LocalDate dtObj = LocalDate.now();
		LocalDateTime dttObj = LocalDateTime.now();
		
		System.out.println(dtObj);
		System.out.println(dttObj);

	}

}
