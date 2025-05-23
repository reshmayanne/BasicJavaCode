package JavaPractise;

public class constructorOverloading {
	
	constructorOverloading()
	{
		System.out.println("New constructor");
	}

	constructorOverloading(String name, long mob_No)
	{
		System.out.println("My Name is "+name);
		System.out.println("My mob no is "+mob_No);
	}

	constructorOverloading(int salary , String Address)
	{
		System.out.printf("Salary and Address are "+ salary, Address);
	}

	constructorOverloading(double age)
	{
		System.out.println("My Age is " +age);
	}

	public static void main(String[] args) {
		constructorOverloading ov=new constructorOverloading();
		//new constructorOverloading();
		new constructorOverloading("Reshma", 45687966);	
		new constructorOverloading(950000, "abc town");	
		new constructorOverloading(35);	

	}

}
