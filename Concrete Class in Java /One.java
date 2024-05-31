package My;

abstract class One 
{
	abstract void show();
	void row()
		{
			System.out.println(" One is Number ");
		}
}
class Two extends One
{
	void show()
	{
		System.out.println(" Two is Number ");
	}
}
class ConcreteMethod
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Two t = new Two();
		t.row();
		t.show();
	}
}
