package My;

public class Stringname extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	Stringname( String name)
	{
		super(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stringname s = new Stringname("Hello");
		s.start();
		System.out.println("This is main Thread");
	}
}
