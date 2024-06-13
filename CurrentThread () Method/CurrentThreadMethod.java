package My;

public class CurrentThreadMethod extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentThreadMethod a = new CurrentThreadMethod();
		a.start();
		System.out.println(Thread.currentThread());
	}
}
