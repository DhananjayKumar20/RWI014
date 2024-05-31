package My;

abstract class Number 
{
	abstract void number();
}
class One extends Number
{
	void number()
	{
		System.out.println(" This is One ");
	}
}
class Two extends Number
{
	void number()
	{
		System.out.println(" This is Two ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		One o = new One();
		o.number();
		
		Two t = new Two();
		t.number();
	}
}
