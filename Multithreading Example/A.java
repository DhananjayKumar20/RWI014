package My;

class A extends Thread 
{
	public void run()
	{
		System.out.println(" This is a Multithreading " );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.start();
		
	}
}

