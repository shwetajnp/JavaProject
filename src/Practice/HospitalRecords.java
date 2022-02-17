package Practice;

public class HospitalRecords {

	public static void main(String[] args) {
		
		String patient="Saroj Mehta";
		int account=345768;
		double amount=200.57d;
		double insurance=90.22d;
		double total= amount - insurance;
		
		System.out.println("\tPatient Details");
		System.out.println("\t================\n");
		System.out.println("Patient Name   :" +patient);
		System.out.println("Date of Birth  :12/02/1991");
		System.out.println("Account        :" +account);
		System.out.println("Amount Due     :" +"$" +amount);
		System.out.println("Insurance paid :" +insurance);
		System.out.println("Total amount   :" +total);
		
		

	}

}
