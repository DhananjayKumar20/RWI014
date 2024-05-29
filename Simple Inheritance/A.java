package My;

public class Simple 
{
	void moon()
	{
		System.out.println(" This is parents Class");
		
	}
}
class Hello extends Simple
{
	 void star()
	{
		System.out.println(" This is Child Class");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Hello a = new Hello();
		a.star();	
		a.moon();
	}

}
