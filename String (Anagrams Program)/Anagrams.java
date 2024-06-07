package My;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1="LISTEN";
		String s2="SILENT";
		char c1[]= s1.toCharArray();
		char c2[]= s1.toCharArray();
		if(c1.length !=c2.length)
		{
			System.out.println("String is Not Anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				System.out.println("String is Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("String is Anagram");
	}
}
