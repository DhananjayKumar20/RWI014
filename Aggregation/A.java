package My;

public class A 
{
	int pincode=8979;
	String Country = "India";
}
class Student
{
	int rollno = 17;
	String name = "Shivam";
	A a = new A();	
}
class relationship
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.a.pincode);
		System.out.println(st.a.Country);
	}
}
