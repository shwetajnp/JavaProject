package Practice;
//import java.io.*;

interface VehicleInterface {
	public void changeGear();	
}
 interface Bicycle{
	 public void brake();	 
 }
 interface Bike1{
	 public void speedUp();
	  }
 class Democlass implements VehicleInterface, Bicycle, Bike1{
	 public void changeGear()
	 {
		 System.out.println("Change the gear");
	 }
	 public void brake()
	 {
		 System.out.println("Brake");
	 }
	 public void speedUp()
	 {
		 System.out.println("speedup");
	 }
 }
