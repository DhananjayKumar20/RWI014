package My;

class Address 
{
	int pincode=8979;
	String Country = "India";
}
class Student
{
	int rollno = 18;
	String name = "Shivam";
	Address b = new Address();	
}
public class HasArelationship
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println(st.rollno);
		System.out.println(st.name);
		System.out.println(st.b.pincode);
		System.out.println(st.b.Country);
	}
}
