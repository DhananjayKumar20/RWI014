package My;

public class RemoveDuplicate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String r1=" Rohaann ";
		String r2="";
		
		for(int i=0;i<r1.length();i++) 
		{
			boolean check=false;
			
			for(int j=0;j<r2.length();j++)
			{
				if(r2.charAt(j)==r1.charAt(i))
				{
					check=true;
					break;
				}
			}
			if(!check)
			{
				r2=r2+r1.charAt(i);
			}	
		}
		System.out.println("r2="+r2);
	}

}
