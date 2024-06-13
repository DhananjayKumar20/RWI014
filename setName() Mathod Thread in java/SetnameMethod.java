package My;

public class SetnameMathod extends Thread
{
	public void run()
	{
		System.out.println("Super");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		SetnameMathod s = new SetnameMathod();
		s.start();
		
		System.out.println(s.getName());
		s.setName("This is Child class");
		System.out.println(s.getName());
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("This is Parents Class");
		System.out.println(Thread.currentThread().getName());		
	}
}
