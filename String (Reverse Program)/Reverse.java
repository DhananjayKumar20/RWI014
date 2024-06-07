package My;

public class Reverse 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int l,i;
		String r="Reverse String";
		String r2="";
		l=r.length();      //l=10
		
		for(i=l-1;i>=0;i--)//i=9		
		{
			r2=r2+r.charAt(i);			
		}
		System.out.println(r2);			
	}
}
