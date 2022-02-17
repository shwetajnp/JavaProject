package Training;

public class LaptopMarket {

	public static void main(String[] args) {
		
		InheritanceEx sObj = new InheritanceEx();
		Laptop alyObj = new Laptop();
		alyObj.greet();
		System.out.println("Brand Name : " +alyObj.brand);
		System.out.println("Keyboard Model :" +alyObj.keyboard);
		
		sObj.greet();
		System.out.println(alyObj.keyboard);

	}

}
