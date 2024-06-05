package My;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=i;
		}
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
