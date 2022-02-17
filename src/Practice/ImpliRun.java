package Practice;

class ImpliRun implements Runnable  {
	
public void run() {
	System.out.println("Thread is running new");
}
	public static void main(String[] args) {
		ImpliRun m1 = new ImpliRun();
		Thread t1 = new Thread(m1);
		t1.start();
		}

}
