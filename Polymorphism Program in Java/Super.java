package My;                  //  Method Overriding //

public class Super
{
	void f1()
	{
		int a=3,b=4,c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);				
		}
	}
}
class Bike extends Super
{
	void f1()           //Override
	{
		int  a=10,b=5,c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);				
		}	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bike m=new Bike();
		m.f1();
	}
}
