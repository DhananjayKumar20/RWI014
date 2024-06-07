package My;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String x = "abcdcba";
		int j;
		int i=0; j=x.length()-1;
		while(i<j)
		{
			if(x.charAt(i)!=x.charAt(j))
			{
				System.out.println(" String is Not palimdrome");
				System.exit(0);		
			}
			i++;
			j--;	
		}
		System.out.println(" String is Palindrome");	
	}
}
