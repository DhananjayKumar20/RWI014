package My;                  //  Method Overloading //

public class Money 
{
	void f1()
	{
		int a=3,b=4,c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);			
			
		}
	}
	void f1(int a,int b)
	{
		int c;
		c=(a+b);
		{
			System.out.println("Addition performed= " +c);			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money m=new Money();
		m.f1();
		m.f1(24,6);
	
	}

}
