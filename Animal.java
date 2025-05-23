package JavaPractise;

public class Animal {

	public static void main(String[] args) {
		
		puppy p=new puppy();
		p.eat();
		p.eat1();
		p.eat2();
	}
	public  void eat2()
	{
		System.out.println("Anything");
	}
	
	
}
	

class wildAnimal extends Animal 
{
	public  void eat1()
	{
		System.out.println("Non-veg");
	}
		
		
}

class puppy extends wildAnimal
{


	public  void eat()
	{
		System.out.println("all animals");
		
	}
	

}