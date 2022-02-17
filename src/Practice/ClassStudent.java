package Practice;

  class ClassStudent {
	  					int rollno;
	  					String name;
	  					
	void insertRecord(int r, String n) 
	{
		rollno=r;
		name=n;
	}
	void displayinfo() 
	{
		System.out.println(rollno +" "+name);
	}  
    	
	public static void main(String[] args) 
	{
		ClassStudent s1 = new ClassStudent();
		ClassStudent s2 = new ClassStudent();
		ClassStudent s3 = new ClassStudent();
		s1.insertRecord(111, "Mohit");
		s2.insertRecord(222, "Pulkit");
		s3.insertRecord(333, "Mehek");
		s1.displayinfo();
		s2.displayinfo();
		s3.displayinfo();
	}
		
	}



