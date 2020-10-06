package p1;

class Person
{
	int pid;
	String name;
	public Person(int pid, String name) 
	{	super();
		this.pid = pid;
		this.name = name;
	}

}
public class Q50B
{
	public static void main(String[] args) 
	{
		Person p1=new Person(90, "Shradha");
		Person p2=new Person(100, "abc");
		Person p3=p2;
		System.out.println("p1 and p2 has Equal reference? =>"+p1.equals(p2)); 
		System.out.println("p1 and p3 has Equal reference? =>"+p2.equals(p3)); 
	}
}
