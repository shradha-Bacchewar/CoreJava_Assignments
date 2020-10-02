class Person
	{
		String name;
		int age;
		
		Person(String name, int age)
		{
			this.age=age;
			this.name=name;
		}
		
		void show()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
	}

	class Employee extends Person
	{
		float salary;
		
		Employee(String name,int age,float salary)
		{
			super(name,age);
			this.salary=salary;
		}
		
		void show()
		{
			super.show();
			System.out.println("Salary: "+salary);
			
		}
	}

	class Q46
	{
		public static void main(String[] args)
		{
			Person p[]={new Employee("shradha",23,65000), new Person("abc",23)};
			
			for(Person ref:p)
			{
				if(ref instanceof Employee) 
				{
					Employee e=(Employee)ref;
					ref.show();
				}
			}
		}
	}