package Practice;

 class AnimalInherit {
	 void eat() {
		 System.out.println("Eating...");
	 }
 }
 class Dog extends AnimalInherit{
	 void bark() {
		 System.out.println("Barking...");
	 }
 }
 class BabyDog extends Dog{
	 void weep() {
		 System.out.println("Weeping...");
	 }
	 void eat() {
		 System.out.println("I am testing method");
	 }
 }
 

	