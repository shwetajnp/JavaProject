package Practice;

public class JavaOperators {

	public static void main(String[] args) {
		
		int x=5;
		int y=8;
		
		System.out.println("sum ="+(x+y));
		System.out.println("Sub ="+(x-y));
		System.out.println("mul ="+(x*y));
		System.out.println("div ="+(x/y));
		System.out.println("mod ="+(x%y));
		System.out.println("incr="+(++x));
		System.out.println("dcr="+(--x));
//assignment operator practice
		System.out.println("Equal=" +x);
		System.out.println("Plus =" +(x+=3));
		System.out.println("Minus=" +(x-=3));
		System.out.println("Mul =" +(x*=3));
		System.out.println("div=" +(x/=3));
		System.out.println("amp=" +(x&=3));
		System.out.println("Or=" +(x|=3));
		System.out.println("power=" +(x^=3));
		System.out.println("incr=" +(x>>=3));
//comparison operator practice
		System.out.println("Equal=" +(x==y));
		System.out.println("Not Equal=" +(x!=y));
		System.out.println("Greater=" +(x>y));
		System.out.println("Small=" +(x<y));
		System.out.println("greater Equal=" +(x>=y));
//logical operator practice
		System.out.println("&& =" +(x<5 && x<10));
		System.out.println("|| =" +(x<5 || x<4));
		System.out.println("&& =" +!(x<5 && x<10));
	}

}
