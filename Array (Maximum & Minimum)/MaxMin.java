package My;

public class MaxMin {
  
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int	a[]= {10,324,45,90,9808};
		int	min=a[0];
		int	max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]>min)
				max=a[i];	
		}
		System.out.println("max value = " +max);
		System.out.println("min value = " +min);
	}
}
