package Practice;

 class ParaConst {
	 int id;
	 String name;
	 ParaConst(int i, String n){
		 id=i;
		 name=n;
	 }
	 void Display() {
		 System.out.println(id +" " +name);
	 }
	 public static void main(String args[]) {
		 ParaConst s1=new ParaConst(111, "Karan");
		 ParaConst s2=new ParaConst(222, "Rohit");
		 s1.Display();
		 s2.Display();		 
	 }
}
