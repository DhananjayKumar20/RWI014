package My;

public class GetnameMathod extends Thread {
	public void run()
	{
		System.out.println("This is Child class");
		//System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetnameMathod g = new GetnameMathod();
		g.start();
		System.out.println(g.getName());
		System.out.println(Thread.currentThread().getName());		
	}
}
