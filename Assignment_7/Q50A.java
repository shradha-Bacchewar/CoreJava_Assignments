//toString() METHOD WITH OVERRIDING:

package p1;


		
		class Employee1
		{
			int empid;
			String name;
			public Employee1(int empid, String name) 
			{
				super();
				this.empid = empid;
				this.name = name;
			}
			@Override  //annotation
			public String toString() //  here we have overridden the toString method 
			{
				return "Employee [empid=" + empid + ", name=" + name + "]";
			}


		}
		public class Q50A
		{
			public static void main(String[] args)
			{
				Employee1 e=new Employee1(12324, "Shradha");
				System.out.println(e);	   
			}
		}
