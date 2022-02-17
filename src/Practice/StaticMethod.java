package Practice;

public class StaticMethod {

	static void EvenNumber() {
		System.out.println("List Of Even Numbers");
		}
	public void DisplayEvenNumber(int num, int end) {
		if(num>end)
		return;
		if(num%2==0)
		{
		System.out.print(num +" ");
		DisplayEvenNumber(num + 2, end);
	}
		else
		{
			DisplayEvenNumber(num + 1, end);
			
		}
	}
	
	public static void main(String[] args) {
		StaticMethod Obj=new StaticMethod();
		
		EvenNumber();
		Obj.DisplayEvenNumber(1, 50);
	}
	
}
