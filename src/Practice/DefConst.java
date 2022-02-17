package Practice;

  class DefConst {
	 int id;
	 String name;
	 
	 void Display() {
		 System.out.println(id + " " +name);	 
	 }
	 public static void main(String args[])
	 {
		 DefConst s1=new DefConst();
		 DefConst s2=new DefConst();
		 s1.Display();
		 s2.Display();
	 }
}
	 
